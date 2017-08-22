package newWish;

class Bank{
	int accNo;
	String accName;
	float amount;
	
	void insert(int accNo, String accName, float amount){
		this.accNo=accNo;
		this.accName=accName;
		this.amount=amount;
	}
	
	void checkBalance(){
		System.out.println("Bank Balance for "+accName+" is: "+amount);
	}
	
	void withdraw(float amt){
		if(amount>=amt)
		{
			amount=amount-amt;
			System.out.println(amt+" successfully withdraw");
		}else{
			System.out.println("Insufficient balance");
		}
	}
	
	void deposit(float amt){
		this.amount=this.amount+ amt;
		System.out.println(amt+" deposited successfully");
	}
}
public class Bankobjectclear {

	public static void main(String[] args) {

		Bank b1=new Bank();
		b1.insert(848785, "Mohit", 20000);
		b1.checkBalance();
		b1.withdraw(1000);
		b1.deposit(500);
		b1.checkBalance();
	}

}
