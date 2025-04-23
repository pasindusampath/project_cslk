package Stack;


public class Stack {
	
	private int top;
	private int maxSize;
	private char[] stackArray;
	
	public Stack(int maxSize) {
		this.maxSize = maxSize;
		this.top = -1;
		this.stackArray = new char [maxSize];
	}
	
	public boolean isFull() {
		return top == maxSize - 1;
	}
	
	public boolean isEmpty() {
		return  top == -1;
	}
	
	public void push(char value) {
		if(isFull()) {
			System.out.println("Stack is Full");
		}else {
			stackArray[++top] = value;
		}
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return '\0';
		}
		return stackArray[top--];
		}
	
	public char peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return '\0';
		}
		return stackArray[top];
		}

}
