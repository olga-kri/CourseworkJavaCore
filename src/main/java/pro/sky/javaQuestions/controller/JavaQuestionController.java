package pro.sky.javaQuestions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.javaQuestions.model.Question;
import pro.sky.javaQuestions.service.QuestionService;

import java.util.Collection;

@RestController
@RequestMapping ("/exam")
public class JavaQuestionController {
    private final QuestionService service;

    public JavaQuestionController(QuestionService service) {
        this.service = service;
    }
    @GetMapping("/java/add?question=QuestionText&answer=QuestionAnswer")
    public Question addJavaQuestion (@RequestParam String question,@RequestParam String answer){
        return service.add(question, answer);
    }
    @GetMapping("/java/remove?question=QuestionText&answer=QuestionAnswer")
    public Question removeQuestion (@RequestParam String question,@RequestParam String answer){
        Question question1 = new Question(question, answer);
        return service.remove(question1);
    }
    @GetMapping("/java")
    public Collection <Question> getQuestions(){
        return service.getAll();
    }
}
