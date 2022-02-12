interface Stack {
    default int getSize(){return 0;}
    default int getTop(){return 0;}
    default boolean isEmpty(){return true;}
    default boolean isFull(){return true;}
    default void push(int val) throws MyStackException {}
    default int pop() throws MyStackException {return 0;}
    default void display() throws MyStackException {}
    default void displayRev() throws MyStackException {}
}
