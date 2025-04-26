package stack_duplicates_finder_app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Queue queue = new Queue(8);
		
		// Ask the user how many elements to input (max 8 as per queue size)
		System.out.print("Enter number of elements (max 8): ");
		int inputSize = scanner.nextInt();

		System.out.println("Enter " + inputSize + " integers:");
		for (int i = 0; i < inputSize; i++) {
			int value = scanner.nextInt();
			queue.insert(value);
		}

		int n = queue.size();
		int duplicate_count = 0;

		for (int i = 0; i < n ; i++) {
			int current = queue.delete();
			int count = 1; //to store duplicates

			int remaining = queue.size();

			//loop through remaining items
			for (int j = 0; j < remaining ; j++ ) {
				int temp = queue.delete();

				if(temp == current) {
					count++;
				}else {
					queue.insert(temp);
				}
			}

			//if more than one occurrence, add duplicates
			if(count > 1) {
				duplicate_count++;
				System.out.println(current + " is duplicated " + count + " times");
			}
		}		

		System.out.println("\nCount of duplicates: " + duplicate_count);
		scanner.close();
	}
}

