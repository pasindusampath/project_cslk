package Stack;

import java.util.Scanner;

public class Main {
	
	static int maxSize = 10;

	public static void main(String[] args) {
		
		Queue queue = new Queue(maxSize);
		Stack stack = new Stack(maxSize);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" Insert 5 characters in acsending order: ");
		for(int i=0; i < 5; i++) {
			char value = scanner.next().charAt(0);
			queue.insert(value);
			stack.push(value);
			
		}
		
		while(!stack.isEmpty()) {
			queue.insert(stack.pop());
		}
		
		System.out.println("Final list elements of queue: ");
		while(!queue.isEmpty()) {
			System.out.println(queue.delete());
			
		}
	
	}

}

