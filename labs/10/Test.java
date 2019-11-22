
public class Test {
	public static void main(String args[]) {
		Employee vec[] = {
				new Manager("Jackie", 52, 104),
				new Clerk("John", 26, 110),
				new Manager("Chris", 42, 120),
				new Manager("Nicole", 34, 120)};
		double hours[] = {140,150,130,180};
		double total = 0;
		for (int index = 0; index < vec.length; index++){
			total += vec[index].salary(hours[index]);
			System.out.println(vec[index]);
		}
		System.out.println("Total payment of the employees is "
				+ total);
 }
}
