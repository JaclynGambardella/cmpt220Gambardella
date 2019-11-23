
import java.util.Scanner; 

public class Part1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] array = new int[100];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)((Math.random() * 100) + 1);
		}
		
		System.out.println("Enter the index of the array: ");
		int index = input.nextInt();
		
		try {
			System.out.println("The corresponding element value is " + array[index]);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of bounds");
		}
		
	}

}
