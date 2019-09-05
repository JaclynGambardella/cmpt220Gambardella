import java.util.Scanner;

public class Lab1part3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for ounces: ");
		double num1 = input.nextDouble();
		System.out.println(num1*28.3495);
		input.close();
	}
}
