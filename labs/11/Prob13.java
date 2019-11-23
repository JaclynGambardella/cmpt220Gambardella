import java.util.*;
public class Prob13 {
	
	public static void main(String[] args){
		int value;
		int maximumVal;
		int[] array = new int[8];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an array of 8 integers: ");
		
		for(int i = 0; i < 8; i++){
			value = sc.nextInt();
			array[i] = value;
			
		}
		maximumVal = array[0];
		maximumVal = maximum(array, array.length-1, maximumVal);
		System.out.println("The largest element in the array is: " + maximumVal);
		
		
	}
	
	public static int maximum(int[] a, int length, int maximumVal){
		if(length > -1){
			if(a[length] > maximumVal){
				maximumVal = a[length];
				
				
			}
			return (maximumVal = maximum(a,length-1, maximumVal));
			
		}
		else 
			return maximumVal;
		
	}

}
