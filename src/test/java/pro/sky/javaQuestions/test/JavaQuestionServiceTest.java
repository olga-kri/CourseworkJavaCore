package pro.sky.javaQuestions.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.javaQuestions.exception.DontFoundQuestion;
import pro.sky.javaQuestions.model.Question;
import pro.sky.javaQuestions.service.JavaQuestionService;

import java.util.ArrayList;
import java.util.List;

import static pro.sky.javaQuestions.QuestionsTestConstants.*;

public class JavaQuestionServiceTest {

    private final JavaQuestionService out = new JavaQuestionService();

    @Test
    public void shouldAddQuestion(){
        out.add(QUESTION1);
        Assertions.assertTrue(out.getAll().contains(QUESTION1));
    }
    @Test
    public void showExceptionWhenAddNull(){
        Assertions.assertThrows(RuntimeException.class,()->out.add(null));
    }
    @Test
    public void showExceptionWhenAddRepeatedQuestion(){
        out.add(QUESTION1);
        Assertions.assertThrows(RuntimeException.class,()->out.add(QUESTION1));
    }
    @Test
    public void shouldRemoveQuestion(){
        out.add(QUESTION1);
        out.remove(QUESTION1);
        Assertions.assertFalse(out.getAll().contains(QUESTION1));
    }
    @Test
    public void showExceptionWhenRemoveNonExistentQuestion(){
        Assertions.assertThrows(DontFoundQuestion.class,()->out.remove(QUESTION2));
    }
    @Test
    public void showExceptionWhenRemoveNull(){
        Assertions.assertThrows(RuntimeException.class,()->out.remove(null));
    }
    @Test
    public void returnAllQuestions(){
        out.add(QUESTION1);
        out.add(QUESTION2);
        out.add(QUESTION3);
        Assertions.assertTrue(out.getAll().containsAll(questionList));
    }
    @Test
    public void getSizeOfQuestionsCollection(){
        out.add(QUESTION1);
        out.add(QUESTION2);
        out.add(QUESTION3);
        Assertions.assertEquals(3,out.getSize());
    }
    @Test
    public void getRandomQuestion(){
        out.add(QUESTION1);
        Assertions.assertEquals(QUESTION1,out.getRandomQuestion());
    }

}
