import java.util.Scanner;
public class Lab3Part1{
	public static void main(String[] args){
		int num1, 
		even = 0, 
		sum = 0, 
		num2 = 0;
		double average = 0.0;
		
		Scanner input = new Scanner (System.in);
		System.out.println ("Enter a positive integer, the input" 
				+ " ends with a 0: 2 3 8 6 12 4 0 ");
		
		do { num1 = input.nextInt();
		if (num1 == 0)
			break;
		if (num1 % 2 == 0 )
			even++;
		sum = sum + num1;
		num2++;
		
		} while (true);
		average = (float) sum / (float) num2;
		
		System.out.println("The number of even numbers: " + even);
		System.out.println("The total sum: " + sum);
		System.out.println("The average is: " + String.format( " %.2f", average));
		
		
		}
		
		
	}	
	
	

