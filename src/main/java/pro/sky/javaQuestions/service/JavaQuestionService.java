package pro.sky.javaQuestions.service;

import org.springframework.stereotype.Service;
import pro.sky.javaQuestions.exception.DontFoundQuestion;
import pro.sky.javaQuestions.model.Question;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

@Service
public class JavaQuestionService implements QuestionService {
    List<Question> javaQuestions = new ArrayList<>();
    @Override
    public Question add(String question, String answer) {
        Question newQuestion = new Question(question, answer);
        validateQuestion(newQuestion);
        if (javaQuestions.contains(newQuestion)){
            throw new RuntimeException("Такой вопрос уже существует");
        }
        javaQuestions.add(newQuestion);
        return newQuestion;
    }

    @Override
    public Question add(Question question) {
        validateQuestion(question);
        if (javaQuestions.contains(question)){
            throw new RuntimeException("Такой вопрос уже существует");
        }
        javaQuestions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        validateQuestion(question);
        if (javaQuestions.contains(question)) {
            javaQuestions.remove(question);
            return question;
        } else throw new DontFoundQuestion();
    }


    @Override
    public Collection<Question> getAll() {
        return javaQuestions;
    }

    @Override
    public Question getRandomQuestion() {
        Random random = new Random();
        int i = random.nextInt(javaQuestions.size());
        return javaQuestions.get(i);
    }
    public void validateQuestion(Question question){
        if (question==null){
            throw new RuntimeException("Введите вопрос!");
        }
    }
    public int getSize (){
        int size = javaQuestions.size();
        return size;
    }
}
