import java.util.*;
public class Prob11 {
	static int sum;
	public static void main(String[] args){
	
	try{
		System.out.println("Enter a number: ");
		
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		int num = Integer.parseInt(string);
		
		System.out.println("The sum is: " + sumDigits(num));
		}
	catch(Exception e){
		System.out.println("An exception has occured, program will exit.");
		System.exit(0);
		
	}
	}
	public static int sumDigits(long n){
		if(n>0){
			sum = sum + (int)n%10;
			sumDigits(n/10);
		}
		return sum;
	}
}
