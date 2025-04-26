package stack_duplicates_finder_app;

public class Queue {
	private int rear;
	private int front;
	private int no_of_items;
	public int maxSize;
	public int getNo_of_items() {
		return no_of_items;
	}

	public void setNo_of_items(int no_of_items) {
		this.no_of_items = no_of_items;
	}

	private int[] queueArray;
	
	public int size() {
		return no_of_items;
	}
	
	
	public Queue(int maxSize) {		
		this.maxSize = maxSize;
		this.rear = -1;
		this.front = 0;
		this.no_of_items = 0;
		this.queueArray = new int [maxSize];
	}
	
	public boolean isEmpty() {
		return no_of_items == 0;
	}
	
	public boolean isFull() {
		return no_of_items == maxSize;
		
	}
	
	public void insert(int value) {
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
	
	public int delete() {
		
		int temp = queueArray[front++];
		
		if (isEmpty()) {			
			return -99;
		}else {
			if(front == maxSize) {
				front = 0;				
			}
			
			no_of_items--;
			return temp;
		}
	}
	
	public int peekFront() {		
		
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return -99;
		}else {			
			return queueArray[front];
		}
	}	
}
