package pro.sky.javaQuestions.exception;

public class DontFoundQuestion extends RuntimeException {
    public DontFoundQuestion() {
    }

    public DontFoundQuestion(String message) {
        super(message);
    }

    public DontFoundQuestion(String message, Throwable cause) {
        super(message, cause);
    }

    public DontFoundQuestion(Throwable cause) {
        super(cause);
    }

    public DontFoundQuestion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
