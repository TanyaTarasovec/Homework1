package exceptions;

public class NewException extends Exception {
    private final static String MESSAGE = "EXCEPTION!";

    public NewException() {
        super(MESSAGE);
    }
}