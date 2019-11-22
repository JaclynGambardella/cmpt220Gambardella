
public class Telephone extends Appliance{
	 private String brand;
	   private boolean isCabled;
	   private boolean isVolte;
	   public Telephone(String brand, boolean isCabled, boolean isVolte, double voltage, String color, String madeIn,
	           double price) {
	       super(voltage, color, madeIn, price);
	       this.brand = brand;
	       this.isCabled = isCabled;
	       this.isVolte = isVolte;
	   }
	   public String getBrand() {
	       return brand;
	   }

	   public void setBrand(String brand) {
	       this.brand = brand;
	   }

	   public boolean isCabled() {
	       return isCabled;
	   }

	   public void setCabled(boolean isCabled) {
	       this.isCabled = isCabled;
	   }

	   public boolean isVolte() {
	       return isVolte;
	   }

	   public void setVolte(boolean isVolte) {
	       this.isVolte = isVolte;
	   }

	   
	   public String toString() {
	       return "Telephone [brand=" + brand + ", isCabled=" + isCabled + ", isVolte=" + isVolte + ", getPrice()="
	               + getPrice() + "]";
	   }
	  
	  
	}


