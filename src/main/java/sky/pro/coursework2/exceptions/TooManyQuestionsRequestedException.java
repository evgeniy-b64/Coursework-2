package sky.pro.coursework2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class TooManyQuestionsRequestedException extends RuntimeException {
    public TooManyQuestionsRequestedException() {
    }

    public TooManyQuestionsRequestedException(String message) {
        super(message);
    }

    public TooManyQuestionsRequestedException(String message, Throwable cause) {
        super(message, cause);
    }

    public TooManyQuestionsRequestedException(Throwable cause) {
        super(cause);
    }

    public TooManyQuestionsRequestedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
