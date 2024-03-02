package pro.sky.javaQuestions.exception;

public class IllegalNumberOfQuestionsException extends RuntimeException {
    public IllegalNumberOfQuestionsException() {
    }

    public IllegalNumberOfQuestionsException(String message) {
        super(message);
    }

    public IllegalNumberOfQuestionsException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalNumberOfQuestionsException(Throwable cause) {
        super(cause);
    }

    public IllegalNumberOfQuestionsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
