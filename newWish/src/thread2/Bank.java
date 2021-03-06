package thread2;

public class Bank implements Runnable 
{
	private Account act = new Account(50);
	
	public static void main(String[] args)
	{
		Bank obj=new Bank();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		
		t1.setName("Mohit");
		t2.setName("Ilu");
		
		t1.start();
		t2.start();
	}

	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(500);
			}catch(InterruptedException e){}
			
			makeWithdraw(10);
			
			if(act.getBalance() < 0)
			{
				System.out.println("Account Overdrawn!!!!");
			}
		}
	}

	private synchronized void makeWithdraw(int amnt) 
	{
		if(act.getBalance() >= amnt)
		{
			System.out.println(Thread.currentThread().getName()+" is going to Withdraw");
			
			act.withdraw(amnt);
			System.out.println(Thread.currentThread().getName()+" -> Withdrawl Amount: "+amnt);
		}else
		{
			System.out.println("Not enough balance to withdraw for ->"+Thread.currentThread().getName()+" Available balance: "+act.getBalance());
		}
	}
}
