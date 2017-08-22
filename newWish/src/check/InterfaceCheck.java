package check;

interface Banks{
	
	void Deposit();
	void Withdraw();
	int calculateRateOfInterest();
	
}

class SBI implements Banks{

	@Override
	public void Deposit() {
		
	}

	@Override
	public void Withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int calculateRateOfInterest() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class InterfaceCheck {

	public static void main(String[] args) {

		Banks ob=new SBI();
	}

}
