package pro.sky.javaQuestions.service;

import pro.sky.javaQuestions.model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
