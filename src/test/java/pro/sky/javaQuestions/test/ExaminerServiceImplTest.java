package pro.sky.javaQuestions.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.javaQuestions.exception.IllegalNumberOfQuestionsException;
import pro.sky.javaQuestions.model.Question;
import pro.sky.javaQuestions.service.ExaminerServiceImpl;
import pro.sky.javaQuestions.service.JavaQuestionService;

import java.util.ArrayList;
import java.util.List;

import static pro.sky.javaQuestions.QuestionsTestConstants.QUESTION3;
import static pro.sky.javaQuestions.QuestionsTestConstants.questionList;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceImplTest {
    @Mock
    private JavaQuestionService javaQuestionService;
    @InjectMocks
    ExaminerServiceImpl out;

    @Test
    public void showExceptionWhenAmountOfQuestionsNotCorrect(){
        Mockito.when(javaQuestionService.getSize()).thenReturn(3);
        Assertions.assertThrows(IllegalNumberOfQuestionsException.class,()-> out.getQuestions(4));
    }
    @Test
    public void showAllQuestionsWhenAmountEquelsSizeofStorage(){
        Mockito.when(javaQuestionService.getSize()).thenReturn(3);
        Mockito.when(javaQuestionService.getAll()).thenReturn(questionList);
        Assertions.assertTrue(out.getQuestions(3).containsAll(questionList));
    }
    @Test
    public void returnAmountOfQuestoins(){
        Mockito.when(javaQuestionService.getSize()).thenReturn(3);
        Mockito.when(javaQuestionService.getRandomQuestion()).thenReturn(QUESTION3);
        Assertions.assertEquals(1,out.getQuestions(1).size());
    }

}
