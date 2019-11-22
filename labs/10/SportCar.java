
class SportsCar implements Printable {
	 private String name;
	 private long number;

	 public void SportCar(String name,long number)
	 {
	   this.name = name;
	   this.number = number;
	 }

	 public void print()
	 {
	   System.out.println("Sports Car : Name : "+name +" Number : "+number);
	 }
	 

}
