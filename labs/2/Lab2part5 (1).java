import java.util.Scanner;
public class Lab2part5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String str1 = input.nextLine();
		System.out.print("Enter second string: ");
		String str2 = input.nextLine();
		
		if (str1.compareTo(str2) < 0)
			System.out.println(str1 + " , " + str2);	
		else
			System.out.println(str2 + " , " + str1);	
	}

}