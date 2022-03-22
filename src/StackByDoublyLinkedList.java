public class StackByDoublyLinkedList implements Stack{
    private NodeD top;
    private NodeD bottom;
    private int size;

    public StackByDoublyLinkedList() {
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public int getTop() {
        return top.getData();
    }

    public int getBottom(){
        return bottom.getData();
    }

    public boolean isEmpty() {
        return size==0;
    }

    public void push(int val){
        NodeD newnode=new NodeD(val);
        if (isEmpty()){
            bottom=newnode;
        }
        else {
            top.setPrev(newnode);
        }
        size++;
        newnode.setNext(top);
        top=newnode;
    }

    public int pop() throws MyStackException{
        if(isEmpty()){
            throw new EmptyStackException();
        }
        size--;
        int ans=top.getData();
        if(top.getNext()==null && top.getPrev()==null){
            top=null;
        }
        else {
            top = top.getNext();
            top.setPrev(null);
        }
        return ans;
    }

    public int peek() throws MyStackException {
        if(isEmpty()) throw new EmptyStackException();
        return top.getData();
    }

    public void display() throws MyStackException{
        if(isEmpty()){
            throw new EmptyStackException();
        }
        NodeD temp=top;
        while (temp!=null){
            System.out.println(temp.getData());
            temp=temp.getNext();
        }
    }

    public void displayRev() throws MyStackException{
        if(isEmpty()){
            throw new EmptyStackException();
        }
        NodeD temp=bottom;
        while (temp!=null){
            System.out.println(temp.getData());
            temp=temp.getPrev();
        }
    }

    public static void main(String[] args) {
        //Stack named "stack" has been created.
        StackByDoublyLinkedList stack= new StackByDoublyLinkedList();
        //Functions can be implemented further.
    }
}
