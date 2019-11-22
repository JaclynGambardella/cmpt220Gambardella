
public class Manager extends Employee {
	public Manager (String name, double age, double hourRate) {
		
	}
	
	@Override
	public double salary (double hours ) {
		return hourRate * hours;
}
}
