import java.util.Scanner;
public class Lab3Part4 {

	public static void main(String[] args) {
		int prime; int count = 0;
		
	for ( prime = 14999; prime > 0; prime --){
	
		if (isPrime(prime)) {
			System.out.println ("The largest prime number that is less than 15,000 is "
					+ prime);
			break;
		}

	}
	
	private static boolean isPrime(int prime) {
		for ( int i = 2; i < prime; i ++) {
			if (prime % i == 0) {
				return false;
			}
		}
		return true;
	}
}