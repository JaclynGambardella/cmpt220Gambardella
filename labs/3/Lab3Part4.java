import java.util.Scanner;
public class Lab3Part4 {

	public static void main(String[] args) {
		int prime; int count = 0;
		
	for ( prime = 14999; prime > 0; prime --){
	
	for ( int i = 1; i <= prime; i ++) {
		if (prime % i == 0) {
			count ++;
		}
	}
	if ( count == 2)
		break;
	
	}
	System.out.println ("The largest prime number that is less than 15,000 is "
			+ prime);

}
}