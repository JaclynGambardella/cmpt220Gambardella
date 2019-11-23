import java.io.*;
import java.util.Scanner;
public class Part3{
	public static void main(String[] args) {
		if(args.length!=2){
		System.out.println("Usage: java Part3 <string> <file>");
		System.exit(0);

		}

try{

Scanner sc = new Scanner(new File(args[1]));
String lines = "";
while(sc.hasNextLine()){
String line = sc.nextLine();
line = line.replaceAll(args[0], "");
lines += line+"\n";

}

sc.close();
PrintWriter print = new PrintWriter(new File(args[1]));
print.println(lines);
print.close();

}
catch(FileNotFoundException e){

System.out.println("Unable to open file");

}
}
}