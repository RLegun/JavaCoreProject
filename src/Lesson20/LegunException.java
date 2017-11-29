package Lesson20;

public class LegunException extends Exception {
    public LegunException() {
        super();
    }

    public LegunException(String message) {
        super(message);
    }

    public LegunException(String message, Throwable cause) {
        super(message, cause);
    }

    public LegunException(Throwable cause) {
        super(cause);
    }

    protected LegunException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
