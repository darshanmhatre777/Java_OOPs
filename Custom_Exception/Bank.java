package Custom_Exception;

public class Bank {
	
	int balance;
	int transactions=4;
	
	public void withdraw (int balance,int amount) throws InsufficientBalanceException {
		
		if (balance < amount) {
			throw new InsufficientBalanceException("Insufficient Balance");
		}
		else {
			balance -= amount;
			System.out.println(amount + "Debited from the account");
			System.out.println("Current balance is"  +balance);
		}
	}
		
		public void deposit (int balance,int amount) throws TransactionLimitExceededException {
			if (transactions > 3) {
				throw new TransactionLimitExceededException("Transaction Limit Exceeded");
				
			}
			else {
				balance += amount;
				System.out.println(amount + " Deposited in account");
				System.out.println("Current balance: " + balance);
				transactions++;
			}
		}
		
		public static void main(String[] args) {
			Bank b1 = new Bank();
			try {
			b1.withdraw(2000,5000);
			}
			catch(InsufficientBalanceException e) {
				System.out.println(e);
			}
			
			try {
				b1.deposit(50000, 5000);
			}
			catch(TransactionLimitExceededException e) {
				System.out.println(e);
			}
			
		}
	}


