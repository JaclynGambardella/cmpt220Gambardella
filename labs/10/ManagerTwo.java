
class ManagerTwo implements Printable{
	 private String name;
	 private long deptNumber;

	 public void Manager(String name,long deptNumber)
	 {
	   this.name = name;
	   this.deptNumber = deptNumber;
	 }
	 public void print()
	 {
	   System.out.println("Manager : Name :"+name +" Department Number : "+deptNumber);
	 }
}
