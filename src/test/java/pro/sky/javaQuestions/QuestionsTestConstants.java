package pro.sky.javaQuestions;

import pro.sky.javaQuestions.model.Question;

import java.util.ArrayList;
import java.util.List;

public class QuestionsTestConstants {
    public static final Question QUESTION1 = new Question("Когда применяется оператор Switch?",
            "Применяется при выборе между несколькими значчениями, " +
                    "позволяет сравнивать только с конкретными значениями, задать  условие нельзя");
    public static final Question QUESTION2 = new Question("Что такое инкапсуляция?",
            "Это концепция, согласно которой доступ к свойствам объекта закрыт, а" +
                    "их значения можно получить через методы");
    public static final Question QUESTION3 = new Question("StringBuilder - это?",
            "Сущность, которую можно создать на основе существующей строки " +
                    "или абсолютно новой(пустой)");
    public static final List<Question> questionList = new ArrayList<>();
}
