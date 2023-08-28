package DataStructures.Stack.LinkedListStack;

public class Node {
    private NodeData data;
    private Node next;

    public Node(NodeData nodeData) {
        this.data = nodeData;
        this.next = null;
    }

    public void setData(NodeData nodeData){
        this.data = nodeData;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public NodeData getData(){
        return this.data;
    }

    public Node getNext(){
        return this.next;
    }
}
