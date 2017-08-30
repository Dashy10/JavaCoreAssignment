package JavaAssignment_PartC;
import java.util.*;
public class Number_Program extends Thread {
//	declaring variables
	int start;
	int end;
	String numberType;
	List<Integer> numberList;
	
	
//	constructor for initializing variables
	Number_Program(String numberType, int start, int end){
		this.start = start;
		this.end = end;
		this.numberType = numberType;
		this.numberList = null;
	}
	
//	overriding function
	@Override
	public void run() {
		if(this.numberType == "EVEN") {
//			when number is even; run this thread
//			create a new array list
			this.numberList =new ArrayList<Integer>();
//			push all even values to new array list
			for(int i = start; i <=end; i++) {
				if(i%2==0) {
					this.numberList.add(i);
				}
			}
//			if not even, push to another arrayList
		}else if(this.numberType == "ODD") {
			this.numberList = new ArrayList<Integer>();
			for(int i = start; i <=end; i++) {
				if(i%2 !=0) {
					this.numberList.add(i);
				}
			}
		}
	}
	
//	print out the numbers in the list
	void display() {
		for(Integer i:numberList) {
			System.out.println(i);
		}
	}
	

}
