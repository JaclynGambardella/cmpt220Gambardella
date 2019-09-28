import java.util.Scanner;
public class Lab4Part8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0, input;
		int b[] = new int[100];
System.out.println("Enter a sequence of positive real numbers, put 0 at the end: ");

input = scan.nextInt();
		while(input != 0 && a<100) {

		b[a] = input; a++;
		input = scan.nextInt();
}
		for (int i=1; i<a; ++i) {
			int c = b[i]; 
			int j = i-1;

		while (j>=0 && b[j] > c) {
			b[j+1] = b[j];

			j = j-1;

	}

		b[j+1] = c;

		}

		System.out.print("The sequence from least to greatest is: ");

		for(int i=0; i<a; i++)
		System.out.print(b[i] + " ");
		System.out.println();

		scan.close();

		}

		}