package stack_duplicates_finder_app;

public class Stack {
	
	private int top;
	private int maxSize;
	private int[] stackArray;
	
	public Stack(int maxSize) {
		this.maxSize = maxSize;
		this.top = -1;
		this.stackArray = new int [maxSize];
	}
	
	public boolean isFull() {
		return top == maxSize - 1;
	}
	
	public boolean isEmpty() {
		return  top == -1;
	}
	
	public void push(int value) {
		if(isFull()) {
			System.out.println("Stack is Full");
		}else {
			stackArray[++top] = value;
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -99;
		}
		return stackArray[top--];
		}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -99;
		}
		return stackArray[top];
		}

}
