package JavaAssignment_PartC;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
//		declare new scanner object
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number range");
		
//		store start and end values for scanner
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		
//		instantiate new Number_Program object and pass required parameters from start-end
		Number_Program threadOne = new Number_Program("ODD", start, end);
		Number_Program threadTwo = new Number_Program("EVEN", start, end);
		
//		start threads
		threadOne.start();
		threadTwo.start();
		
//		display thread results
		threadOne.display();
		threadTwo.display();

	}

}
