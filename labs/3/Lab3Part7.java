import java.util.Scanner;
public class Lab3Part7{ 
	public static int pentNum (int n){
		return (n*(3* n - 1 ) / 2);
	}
	
	public static void main (String [] args){
		System.out.print("The first 50 pentagonal numbers are: ");
				
		int line = 1;
		for (int i = 1; i <= 50; i ++) {
			
		System.out.printf(" %-5d", pentNum (i));
			if (line % 10 == 0 ) System.out.println();
				++line; 
			
		}
	}
	
}
