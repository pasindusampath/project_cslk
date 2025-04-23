package Stack;


public class Queue {
	private int rear;
	private int front;
	private int no_of_items;
	private int maxSize;
	private char[] queueArray;
	
	
	public Queue(int maxSize) {		
		this.maxSize = maxSize;
		this.rear = -1;
		this.front = 0;
		this.no_of_items = 0;
		this.queueArray = new char [maxSize];
	}
	
	public boolean isEmpty() {
		return no_of_items == 0;
	}
	
	public boolean isFull() {
		return no_of_items == maxSize;
		
	}
	
	public void insert(char value) {
		if (isFull()) {
			System.out.println("Queue is Full");
		}else {
			if(rear == maxSize - 1) {
				rear = - 1;
			}
			queueArray[++rear] = value;
			no_of_items++;
		}
	}
	
	public char delete() {
		
		char temp = queueArray[front++];
		
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return '\0';
		}else {
			if(front == maxSize) {
				front = 0;				
			}
			
			no_of_items--;
			return temp;
		}
	}
	
	public char peekFront() {		
		
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return '\0';
		}else {			
			return queueArray[front];
		}
	}
	
	

}
