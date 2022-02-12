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
        /*
        obj.push(10);
        obj.push(20);
        obj.push(30);
        try {
            obj.pop();
            obj.pop();
            obj.pop();
            System.out.println("popped: "+obj.pop());
            obj.display();
        }
        catch (MyStackException e){
            System.out.println(e.getMessage());
        }
         */
    }
}
