package DataStructures.Stack.LinkedListStack;

public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public boolean isEmpty(){
        return (top == null);
    }

    public void push(NodeData item){
        Node node = new Node(item);
        node.setNext(top);
        top = node;
    }

    public NodeData pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            System.exit(1);
        }

        NodeData nodeData = top.getData();
        top = top.getNext();

        return nodeData;
    }

//    Peak
    public NodeData top(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            System.exit(1);
        }
        return top.getData();
    }
}
