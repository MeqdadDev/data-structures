package DataStructures.Stack.LinkedListStack;

public class Main {

    public static void main(String[] args) {

        Stack s = new Stack();
        NodeData d1 = new NodeData(10);
        NodeData d2 = new NodeData(20);

        s.push(d1);
        System.out.println(s.top());
        s.push(d2);
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
    }
}
