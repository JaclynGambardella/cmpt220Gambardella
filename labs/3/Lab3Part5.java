import java.util.Scanner;
public class Lab3Part5 {
	
	public static double average (double a, double b, double c) {
		
		double total = a + b + c; 
		double average = total / 3;  
			return average;		
}
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter first number:  ");
		double a = input.nextDouble();
		
		System.out.print("Enter second number:  ");
		double b = input.nextDouble();
		
		System.out.print("Enter third number:  ");
		double c = input.nextDouble();
		 
		System.out.print("The average is: "
				+ average (a,b,c));
	}
	}