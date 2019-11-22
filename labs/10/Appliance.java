
public class Appliance implements Comparable<Appliance> {
	private double voltage;
	   private String color;
	   private String madeIn;
	   private double price;
	   public Appliance(double voltage, String color, String madeIn, double price) {
	       super();
	       this.voltage = voltage;
	       this.color = color;
	       this.madeIn = madeIn;
	       this.price = price;
	   }
	   public double getVoltage() {
	       return voltage;
	   }
	   public void setVoltage(double voltage) {
	       this.voltage = voltage;
	   }
	   public String getcolor() {
	       return color;
	   }
	   public void setcolor(String color) {
	       this.color = color;
	   }
	   public String getMadeIn() {
	       return madeIn;
	   }
	   public void setMadeIn(String madeIn) {
	       this.madeIn = madeIn;
	   }
	   public double getPrice() {
	       return price;
	   }
	   public void setPrice(double price) {
	       this.price = price;
	   }
	
	public int compareTo(Appliance arg0) {
		return 0;
 }
 public String toString() {
     return "Appliance [voltage=" + voltage + ", color=" + color + ", madeIn=" + madeIn + ", price=" + price + "]";
 }


}

