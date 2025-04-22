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

//Question - characters given in a circular queue are stored in 
//descending order. write a java program to duplicate the same characters 
//in ascending order and append to the same queue. Simulate the above 
//scenario by first entering 5 characters from the keyboard in ascending order. 
//Store them in the queue. Finally remove all the values from the queue and display them. 
//Eg:- (Before) [Z|Y|X|W|V| | | | | ]  After:- [Z|Y|X|W|V|V|W|X|Y|Z]
