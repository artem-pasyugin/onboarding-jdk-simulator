import java.time.LocalDateTime;

public class CustomDateException extends Exception {

    public CustomDateException(String message) {
        super(message + LocalDateTime.now());
    }
}
