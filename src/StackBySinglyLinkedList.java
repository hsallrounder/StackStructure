public class StackBySinglyLinkedList implements Stack{
    private NodeS top;
    private int size;

    public StackBySinglyLinkedList() {
        this.size = 0;
        top=null;
    }

    public int getSize() {
        return size;
    }

    public int getTop() {
        return top.getData();
    }

    public boolean isEmpty() {
        return size==0;
    }

    public void push(int val){
        size++;
        NodeS newnode=new NodeS(val);
        newnode.setNext(top);
        top=newnode;
    }

    public int pop() throws MyStackException{
        if(isEmpty()){
            throw new EmptyStackException();
        }
        size--;
        int ans=top.getData();
        top=top.getNext();
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
        NodeS temp=top;
        while (temp!=null){
            System.out.println(temp.getData());
            temp=temp.getNext();
        }
    }

    public static void main(String[] args) {
        //Stack named "stack" has been created.
        StackBySinglyLinkedList stack = new StackBySinglyLinkedList();
        //Functions can be implemented further.
    }
}
