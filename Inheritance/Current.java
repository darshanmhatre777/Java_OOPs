package Inheritance;

public class Current extends Account{
	
	private int transactions=0;
	static int processingFees=1000;

	public Current(int accid, double balance) {
		super(accid, balance);
		
	}

	@Override
	public void withDraw(int amount) {

		if(amount < balance && transactions <=1 && amount <= 20000) {
			balance -= amount;
			System.out.println(amount+ " Debited from account");
			System.out.println("Remaining balance: " + balance );
			transactions++;	
		}

		else if (transactions > 3) {
			System.out.println("Exceeded transaction limit");
		}
		else
		{
			System.out.println("Insufficient balance");
		}
				
	}

}
