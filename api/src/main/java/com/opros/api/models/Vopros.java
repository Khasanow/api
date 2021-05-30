package com.opros.api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity//говорит о том что это модель
public class Vopros {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//при добавлении новой записи генерит значение айди
    private Long id;
    private String text_voprosa;
    private String question;

    public Vopros(String question, String text_voprosa) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText_voprosa() {
        return text_voprosa;
    }

    public void setText_voprosa(String text_voprosa) {
        this.text_voprosa = text_voprosa;
    }

    public String getQuestion() {
        return question;
    }
    public String setQuestion(String question) {
        return question;
    }

//    public Vopros(String question, String text_voprosa){
//        this.question = question;
//        this.text_voprosa = text_voprosa;
//    }
}
