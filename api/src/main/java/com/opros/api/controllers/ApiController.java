package com.opros.api.controllers;

import com.opros.api.models.Vopros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller //класс который отвечает за все переходы на сайте
public class ApiController {

    @Autowired
    private VoprosRepository voprosRepository;

    @GetMapping("/")
    public String dom(Model model) {
        Iterable<Vopros> vopros = voprosRepository.findAll();
        model.addAttribute("vopros", "Главная страница");
        return "dom";//данную страницу возвращает
    }

    @PostMapping("/dom")
    public String postVopros(@RequestParam String question, @RequestParam String text_voprosa, Model model) {
        Vopros vopros = new Vopros(question, text_voprosa);
        voprosRepository.save(vopros);
        return "redirect:/dom";
    }

}