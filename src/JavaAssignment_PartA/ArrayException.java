package JavaAssignment_PartA;

import java.util.*;

public class ArrayException {

	public static void main(String[] args) {
// 		declare variables
		int arraySize;
		int [] arr;
		int index;
// create new scanner object		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array");
		
// store user prompt in variable
		arraySize = scanner.nextInt();
		arr = new int[arraySize];
		System.out.println("Enter the elements in the array");
// user enters input until arr.length		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
// check array elements
		
		try {
			System.out.println("Enter the index of the array element to be accessed");
// 			store index to search the array indexes
			index = scanner.nextInt();
			
			System.out.println("Array element at index " + index + "is " + arr[index]);
// 		throw an exception if array is out of bounds
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getClass().getCanonicalName());
		}

	}

}
