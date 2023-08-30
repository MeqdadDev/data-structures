package StackProblems.BalancedParentheses.CustomizedArrayStack;

public class ArrayStack {

    private final char[] stack = new char[100];
    int top;

    public ArrayStack() {
        this.top = -1;
        System.out.println("Stack initialized, MaxSize=100");
    }

    public void push(char item){
        top++;
        try {
            stack[top] = item;
            int percent = top + 1;
            System.out.println("Used Space = " + percent + "%");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Stack is full");
            top--;
        }
    }

    public void pop(){
        top--;
        if (isEmpty()){
            return;
        }
    }

    public char getTop(){
        if (!isEmpty())
            return stack[top];
        return '*';
    }

    public void display(){
        for(int i=0; i<=top;i++)
            System.out.println(stack[i]);
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
