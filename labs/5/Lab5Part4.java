import java.util.Scanner;
public class Lab5Part4 {
	
	public static boolean equal(int[] x, int[] y){
		boolean bool = true;
		
		sort(x);
		sort(y);
		for(int i=0;i<x.length;i++){
			if(x[i] != y[i]){
				bool = false; 	
			}
		}
		return bool;	
	}	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[6];
		int[] b = new int[6];
		System.out.println("Enter the first array of six numbers: ");

		for(int j=0; j<a.length; j++){
			a[j] = scan.nextInt();
		}
		System.out.println("Enter the second array of six numbers: ");
		for(int k=0; k<b.length; k++){
		   b[k] = scan.nextInt();
		}
		boolean equalString = Lab5Part4.equals(a,b);
		if(equalString == true){ 
			System.out.println("The arrays are equal"); 
		   
		}
		else{
		   System.out.println("The arrays are not equal");   
		}	   
	}
	
	private void sort(int[] array) {
		for (int i = 0; i < array.length;i++) {
			int min = array[i];
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) 
				if (array[j] < min) {
					min = array[j];
					minIndex = j;
				}
			if (minIndex != i) {
				int tmp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = tmp;
			}
		}
	}	
}
	

