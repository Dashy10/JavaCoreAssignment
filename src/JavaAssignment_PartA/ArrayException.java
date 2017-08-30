package JavaAssignment_PartA;

import java.util.*;

public class ArrayException {

	public static void main(String[] args) {
		int arraySize;
		int [] arr;
		int index;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array");
		
		
		arraySize = scanner.nextInt();
		arr = new int[arraySize];
		System.out.println("Enter the elements in the array");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		try {
			System.out.println("Enter the index of the array element to be accessed");
			
			index = scanner.nextInt();
			
			System.out.println("Array element at index " + index + "is " + arr[index]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getClass().getCanonicalName());
		}

	}

}
