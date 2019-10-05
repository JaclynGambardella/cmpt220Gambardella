import java.util.Scanner;
public class Lab5Part4 {
	
	public static boolean equal(int[] x, int[] y){
		boolean bool = false;
		
		for(int i=0;i<x.length;i++){
			if(array1[i] == y[i]){
				bool = true; 	
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
}
	

