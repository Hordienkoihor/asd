package practice7.assignment2;

public class AppException extends RuntimeException {
    public AppException(String message, Throwable cause) {
        super(message + cause +". App exception") ;
    }
}
