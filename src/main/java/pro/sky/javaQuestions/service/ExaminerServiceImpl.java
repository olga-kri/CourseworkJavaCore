package pro.sky.javaQuestions.service;

import org.springframework.stereotype.Service;
import pro.sky.javaQuestions.exception.IllegalNumberOfQuestionsException;
import pro.sky.javaQuestions.model.Question;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class ExaminerServiceImpl implements ExaminerService {

   private JavaQuestionService javaQuestionService;

    public ExaminerServiceImpl(JavaQuestionService javaQuestionService) {
        this.javaQuestionService = javaQuestionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        int size = javaQuestionService.getSize();
        if (amount>size || amount<=0) {
            throw new IllegalNumberOfQuestionsException();
        }
        if (amount == size){
            return javaQuestionService.getAll();
        }
        List<Question> questionsList = new ArrayList<>();
        for (int i = 1; i <= amount;) {
            Question question = javaQuestionService.getRandomQuestion();
            if (questionsList.contains(question)){
                continue;
            } else {
                questionsList.add(question);
                i++;
            }

        }
        return questionsList;
    }

}
