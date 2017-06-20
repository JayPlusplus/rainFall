package rainFall;
import java.util.Scanner;
public class Rainfall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double length, width,thickness;
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("length");
		length = keyboard.nextDouble();
		System.out.println("Width");
		width = keyboard.nextDouble();
		System.out.println("thickness");
		thickness = keyboard.nextDouble();
		System.out.println(length * width * thickness);
		
		
	    
		if (length > 0 && length <= 300){
			//length is between 0 - 300
			
		System.out.print("it is rainfall!");
		}
		else if (length > 300 && length <= 600){
			//length is bigger than 300 and less or equal than 600
			System.out.print("it's pouring!");	
		}
		else { 
			//not possible condition
			System.out.print("it's impossible!");
		}
	}

}

