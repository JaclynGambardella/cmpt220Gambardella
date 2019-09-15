import java.util.Scanner;
public class Lab2part4 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first character: ");
		char let1 = input.nextLine().charAt(0);
		System.out.print("Enter second character: ");
		char let2 = input.nextLine().charAt(0);
		System.out.print(let1 + let2);
		
	}

}
