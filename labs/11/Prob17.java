import java.util.Scanner;
public class Prob17 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter characters: ");
		String string = input.nextLine();
		
		char[] array = string.toCharArray();
		
		System.out.println("Enter a character to see its number of occurences: ");
		
		String string1 = input.next();
		
		char c = string1.charAt(0);
		int occurs = count(array, c);
		
		System.out.println("The number of occurences is: " + occurs);
		
	}
	public static int count(char[] chars, char c){
		return count(chars, c, chars.length-1);
		
	}
	public static int count(char[] chars, char c, int high){
		
		if(high >= 0){
			int count = 0;
			char c1 = chars[high];
			
			if(Character.toUpperCase(c) == Character.toUpperCase(c1))
				count++;
			
			return count + count(chars, c, high-1);
			
		}
		else
			return 0;
		
	}
	

}
