import java.util.Scanner;

public class Lab1part4 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a mass: ");
		double val1 = input.nextDouble();
		System.out.println(val1*Math.pow(299972458,2));
		input.close();
	}
}
