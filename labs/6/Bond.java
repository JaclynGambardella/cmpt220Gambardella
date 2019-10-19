
public class Bond {
	private double coupon; 
	private int payments;
	private double interest;
	private double valueMaturity;
	private double price;
	
	public Bond(){
		coupon=0;
		payments=0;
		interest=0;
		valueMaturity=0;
	}
	
	public Bond(double coupon, int payments, double interest, double valueMaturity) {
		this.coupon = coupon;
		this.payments = payments;
		this.interest = interest;
		this.valueMaturity = valueMaturity;

	}
	
	public double getPrice() {
		
		price=(coupon * (1-(1/(Math.pow(1 + interest, payments))))) + (valueMaturity*(1/(Math.pow(1 + interest, payments))));
		return price; 
	}
	
	public static void main(String[] args) {
		Bond testBond = new Bond(500,100,5,10000); 
		
		System.out.println("The price of bond is: $ " + testBond.getPrice());
	}
}
