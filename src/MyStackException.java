public class MyStackException extends Exception{
    public MyStackException() {}
}
class EmptyStackException extends MyStackException{
    public EmptyStackException() {}

    @Override
    public String getMessage() {
        return "Stack is Empty";
    }
}
class FullStackException extends MyStackException{
    public FullStackException() {}

    @Override
    public String getMessage() {
        return "Stack is Full";
    }
}

