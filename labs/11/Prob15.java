import java.util.*;
import java.io.*;
public class Prob15 {
	static int i = 0;
	
	public static void main(String args[]){
		try{
			System.out.print("Enter a string: ");
			Scanner sc = new Scanner(System.in);
			String string = sc.nextLine();
			System.out.print("Enter a character: ");
			
			String temp = sc.nextLine();
			char c = temp.charAt(0);
			int count = count(string, c, 0 );
			 
			 System.out.println("There are " + count + " " + c  + "'s.");
			 
		}
		catch(Exception e){
			System.out.println(" An exception has occured in the class, program will exit. ");
			System.exit(0);
		}
	}

	public static int count(String string, char a, int high){
		if(string.equals("")){
			return 0;
			
		}
		if(high + 1 <= string.length()){
			
			if(string.substring(high, high+1).equals(Character.toString(a))) {
				
				
				i++;
				
				
		}
		count(string.substring(high+1,string.length()), a ,high);
		
	}
	
	return i;
	
}
}
