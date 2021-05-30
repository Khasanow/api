package com.opros.api.repo;

import com.opros.api.models.Vopros;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.springframework.data.repository.CrudRepository;

interface QuestionRepository extends CrudRepository<TypePatternQuestions.Question, String> {
}

