package check;

abstract class Bank{
	
	private int intialAmount=0;
	
	public void deposit(int amount){
		this.intialAmount+=amount;
		System.out.println("Deposit process Common For all Banks");
		System.out.println("Deposit Amount Successfully Updated New Account Balance:"+this.intialAmount);
	}
	
	public void withdraw(int amount){
		this.intialAmount-=amount;
		System.out.println("Withdraw process Common For all Banks");
		System.out.println("Withdraw Amount Successfully Updated New Account Balance:"+this.intialAmount);
	}
	
	abstract int calculateRateOfInterest();
}

class HDFC extends Bank{

	@Override
	int calculateRateOfInterest() {

		return 7;
	}
	
}

class CITI extends Bank{
	
	@Override
	int calculateRateOfInterest() {
		// TODO Auto-generated method stub
		return 8;
	}
	
}
public class AbstractCheck {

	public static void main(String[] args) {
		Bank hdfc=new HDFC();
		hdfc.deposit(5000);
		hdfc.withdraw(1000);
		System.out.println(hdfc.calculateRateOfInterest());
		
		Bank citi=new CITI();
		citi.deposit(10000);
		citi.withdraw(5000);
		System.out.println(citi.calculateRateOfInterest());
		
		
		
	}

}
