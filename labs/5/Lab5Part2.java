import java.util.Scanner;
public class Lab5Part2 {
	
	public static double mean (double []x) {
	double sum = 0;
	double mean = 0;
	double length = x.length; 	
	
	for (double n:x)
	sum += n;
	mean = sum/length;
	return mean;
	
	}
	
	public static double sd(double x[]) {
		double standardDeviation = 0; 
		double length = x.length;
		double mean = mean(x);
		
		for (int i = 0; i<length; i++)
		standardDeviation+=(x[i]-mean)*(x[i]-mean);
		return Math.sqrt(standardDeviation/length);
		
}
	public static void main(String[] args) {
		double array[] = new double[10];
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 10 Numbers.");
		
		for (int i = 0; i<10; i++)
		array[i] = scan.nextDouble();	
		System.out.println("The mean is: "+mean(array));
		System.out.println("The standard deviation is: "+sd(array));
	
}
}