import java.util.Random;

public class Lab4Part2 {
	public static void main(String[] args) {
		
		char fiveByFiveMatrix [][] = new char [5][5];
		Random r = new Random ();
		
		for (int i=0; i<5; i++) {
		for (int j=0; j<5; j++) {
		
		char c = (char)(r.nextInt(26)+'a');
		
		fiveByFiveMatrix [i][j] = c;
		System.out.print(fiveByFiveMatrix [i][j]+ " ");
}	
		
		System.out.print("\n");
		
}		
}
}