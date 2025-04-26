package ascending_converter_app;

public class Stack {
    private int top;
    private final int capacity;
    private final char[] stackArray;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.top = -1;
        this.stackArray = new char[capacity];
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(char value) {
        if (isFull()) {
            System.out.println("Stack is Full");
            return;
        }
        stackArray[++top] = value;
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return '\0';
        }
        return stackArray[top--];
    }

    public char peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return '\0';
        }
        return stackArray[top];
    }
}
