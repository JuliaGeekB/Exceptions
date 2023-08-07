package Exceptions;

public class InvalidNumberException extends RuntimeException{

    public InvalidNumberException(String string) {
        super (string);
    }

}