import java.util.Scanner;
public class Lab3Part6{	
	public static int Vowel (String s){
		int count = 0;
		for (int i = 0; i < s.length(); i ++){
			char vowel = s.charAt(i);
		if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u'){
			count += 1;
		}
		}
		return count;
	}
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter string: ");
		String string = input.nextLine(); // JA: You should read the complete line
		System.out.print("Number of vowels = " + Vowel(string));
	}
}
