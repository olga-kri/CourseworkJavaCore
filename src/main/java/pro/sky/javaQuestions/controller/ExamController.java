package pro.sky.javaQuestions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.javaQuestions.model.Question;
import pro.sky.javaQuestions.service.ExaminerService;

import java.util.Collection;

@RestController
public class ExamController {
    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }
    @GetMapping("/exam/get/{amount}")
    public Collection <Question> getQuestions (@PathVariable int amount){
        return examinerService.getQuestions(amount);

    }
}
