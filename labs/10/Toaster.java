
public class Toaster extends Appliance{
	  private String brand;
	   private String model;
	   private boolean isAutomatic;

	   public Toaster(String brand, String model, boolean isAutomatic, double voltage, String color, String madeIn,
	           double price) {

	       super(voltage, color, madeIn, price);
	       this.brand = brand;
	       this.model = model;
	       this.isAutomatic = isAutomatic;
	   }

	   public Toaster() {
	       super(0, "None", "None", 0);
	   }
	   
	   public String getBrand() {
	       return brand;
	   }

	   public void setBrand(String brand) {
	       this.brand = brand;
	   }

	   public String getModel() {
	       return model;
	   }

	   public void setModel(String model) {
	       this.model = model;
	   }

	   public boolean isAutomatic() {
	       return isAutomatic;
	   }

	   public void setAutomatic(boolean isAutomatic) {
	       this.isAutomatic = isAutomatic;
	   }

	   
	   public String toString() {
	       return "Toaster [brand=" + brand + ", model=" + model + ", isAutomatic=" + isAutomatic + ", getPrice()="
	               + getPrice() + "]";
	   }
	  
	  
	}

