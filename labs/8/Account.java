
public class Account {
	private int number;
	private double balance;
	private double annualInterestRate;
	
	private java.util.Date dateCreated = new java.util.Date();
	
	public Account(){
		java.util.Date dateCreated = new java.util.Date();
		
	}

	 public Account (int id, double bal, double AIRate){
		 number = id;
		 balance = bal;
		 annualInterestRate = AIRate;
	 }
	 public void setDate(java.util.Date dateCreated){
	this.dateCreated = dateCreated;
	 }
	public java.util.Date getDate(){
		return dateCreated;
			
		}
		
		public int getID(){
			return number;
			
		}
		
		public double getBalance(){
			return balance;
			
		}
		
		public double deposit(double deposit){
			balance += deposit;
			return(deposit);
			
		}
		
		public double withdraw(double withdraw){
			this.balance -= withdraw;
			return(withdraw);
			
		}
		
		public double getAnnualInterestRate(){
			return annualInterestRate;
			
		}
		public void setAnnualInterestRate(double annualInterestRate){
			this.annualInterestRate = annualInterestRate;
			
		}
		
		public double getMonthlyInterestRate(){
			double monthlyInterest = (annualInterestRate / 1200) * balance;
			return monthlyInterest;
		}
	 }
	 
	 
