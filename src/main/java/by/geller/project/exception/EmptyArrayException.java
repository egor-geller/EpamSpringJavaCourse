package by.geller.project.exception;

public class EmptyArrayException extends Exception{
    public EmptyArrayException(){}

    public EmptyArrayException(String input){
        super(input);
    }
}
