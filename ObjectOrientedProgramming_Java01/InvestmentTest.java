public class InvestmentTest {

	public static void main (String[]args) {
		
		Investment i = new Investment();
		
		double interest = i.totalInterest();
		double invest = i.totalInvestment(5);
		
		System.out.printf("The total interest would be: $%.2f%n", interest);
		System.out.printf("The total investment would be: $%.2f%n", invest);
	
	}
}

class Investment {
	
	double balance = 1000;
	double interestRate = 3.5;
	
	//balance must be greater than 0, default 10000
	//interest rate must be greater than 0 and no more than 12, default 3.5
	public Investment(double balance, double interestRate){
		if (balance > 0) {
			this.balance = balance;
		} else {
			this.balance = 1000.00;
		}
		
		if (interestRate > 0 && interestRate <= 12) {
			this.interestRate = interestRate;
		} else {
			this.interestRate = 3.5;
		}
	}
	
	//no arg constructor for default values
	public Investment(){
	}
	
	//totalInterest method 
	public double totalInterest(){
		return this.balance*(this.interestRate/100);
	}
	
	//totalInvestment method with formal parameter: period
	public double totalInvestment(int period) {
		double total = 1+(this.interestRate/100);
		double calc = Math.pow(total, period);
		return this.balance*calc;
	}
}


	
	