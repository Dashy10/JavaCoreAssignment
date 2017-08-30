package JavaAssignment_PartB;
//import necessary utils
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TransformerOptimusPrimeQuest {
//	declare variables x and y
	int x;
	int y;
//constructor method for initializing variables
	TransformerOptimusPrimeQuest(){
		this.x = 0;
		this.y = 0;
	}
//method for moving one y coordinate in the positive direction
//	methods are all void because there is no return/return type
	void up(){
		this.y +=1;
		
	};
//method for moving one y coordinate negative
	void down(){
		this.y -=1;
	};
//method for moving one x coordinate negative
	void left(){
		this.x -=1;
		
	}
//method for moving one x coordinate positive
	void right(){
		this.y +=1;
		
	}
	
	public static void main(String args[]) throws IOException {
//		instantiate new InputStreamReader object
		InputStreamReader read = new InputStreamReader(System.in);
//     instantiate new BufferedReader object and pass it an object to read
		BufferedReader buffered = new BufferedReader(read);
//		use read line method for commands
		String commands = buffered.readLine();
//		instantiate new Optimus Prime object
		TransformerOptimusPrimeQuest movement = new TransformerOptimusPrimeQuest();
//		if the command length is less than or equal to ten, iterate over string length
//		based upon which character is found, issue different command by making use of the movement methods defined class level above
		if(commands.length() <=10) {
			for(int i =0; i<commands.length();i++) {
				char command = commands.charAt(i);
				
				if(command == 'U') {
					movement.up();
				}
				else if(command == 'D') {
					movement.down();
				}
				else if(command == 'L') {
					movement.left();
				}
				else if(command == 'R') {
					movement.right();
				}
			}
			System.out.println(movement.x + " " + movement.y);
		} else {
//			if greater than 10, invalidate command 
			System.out.println("Can't move there");
		}
		
		
	}
	

}
