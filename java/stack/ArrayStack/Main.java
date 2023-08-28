package DataStructures.Stack.ArrayStack;

public class Main {
    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(); // default size=100
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.getTop());

        stack.pop();

        System.out.println(stack.getTop());

        System.out.println(stack.isEmpty());

        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.isEmpty());
        stack.pop();
        System.out.println(stack.isEmpty());

        System.out.println(stack.getTop());

        for(int i=0; i<=10; i++){
            stack.push(i);
            System.out.println(stack.getTop());
        }

        System.out.println(stack.getTop());

//        Display stack items
        stack.display();


    }
}