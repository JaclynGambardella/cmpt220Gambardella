import java.util.*;
public class Lab3Part2 {
	public static void main(String[] args){
		
		int num1, i = 1;
		
		for (num1 = 100; num1 <= 500; num1++){
			
			if (( num1 % 5 == 0 && num1 % 7 != 0) ||
					(num1 % 5 != 0 && 7 == 0)){ 
				
				if (i <= 10) {
					System.out.print( num1 + "  ");
					i++;
				}
				else {
					System.out.println();
					i = 1;

				}
			}
		}

	}

}

