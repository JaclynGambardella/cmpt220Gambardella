import java.text.DecimalFormat;
public class Lab4Part1 {
	public static void main(String[] args) {
		DecimalFormat dec = new DecimalFormat("0.00");
			System.out.print("\n|in     cm|cm	  in|");
			System.out.print("\n---------------------");
			
			for (int i=1, j=1; i<=50;){
				 
			System.out.printf("\n%2d", i);
			System.out.print(dec.format(i * 2.54));
			
			System.out.print("|%3d",j);
			System.out.print(dec.format(j*0.393701));
			i = i + 1;
			j = j + 5;
			}
	}

}