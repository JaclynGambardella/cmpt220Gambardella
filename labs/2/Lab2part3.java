
import java.util.Scanner;
public class Lab2part3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);	
		System.out.print("Enter the lower limit: ");
		int num1 = input.nextInt();
		System.out.print("Enter the upper limit: ");
		int num2 = input.nextInt();

		// JA: This part generates the random numbers
		int rand1 = (int)(Math.random() * (num2 - num1)) + num1;		
		int rand2 = (int)(Math.random() * (num2 - num1)) + num1;		
		int rand3 = (int)(Math.random() * (num2 - num1)) + num1;		

		System.out.println("The random numbers are: " + rand1 + " " + rand2 + " " + rand3);
	}

}
