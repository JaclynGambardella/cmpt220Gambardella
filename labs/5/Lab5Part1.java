import java.util.Scanner;
public class Lab5Part1 {
	
	public static double max(double[] array){
		double largestVal = array [0];
			
		for (int i = 0; i < array.length; i++)
			if (array [i] > largestVal)
				largestVal = array [i];
				return largestVal;
	}	
	public static void main (String [] args) { 
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter 10 numbers: ");
		double array []= new double [10];
		for (int i = 0; i < 10; i++) {
			array [i] = scan.nextInt();
		
	}
		
		System.out.print("The largest value in the array is: " + max (array));
}
}