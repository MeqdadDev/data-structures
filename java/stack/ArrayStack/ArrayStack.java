package DataStructures.Stack.ArrayStack;

public class ArrayStack {

    private final int[] stack = new int[100];
    int top;

    public ArrayStack() {
        this.top = -1;
        System.out.println("Stack initialized, MaxSize=100");
    }

    public void push(int item){
        top++;
        try {
            stack[top] = item;
            int percent = top + 1;
            System.out.println("Used Space = " + percent + "%");
        }catch (java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("Stack is full");
            top--;
        }
    }

    public void pop(){
        top--;
        if (isEmpty()){
            System.exit(1);
        }
    }

    public int getTop(){
        if (top > -1)
            return stack[top];
        else
            return top;
    }

    public void display(){
        for(int i=0; i<=top;i++)
            System.out.println(stack[i]);
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
