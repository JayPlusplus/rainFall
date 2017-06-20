package rainFall;
import java.util.Scanner;
public class Rainfall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1, num2,num3;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("length");
		num1 = keyboard.nextDouble();
		System.out.println("Width");
		num2 = keyboard.nextDouble();
		System.out.println("thickness");
		num3 = keyboard.nextDouble();
		System.out.println(num1 * num2 * num3);
		
		
	}

}

