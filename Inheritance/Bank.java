package Inheritance;

public class Bank {
	
	public void withDrawMoney(Account a, int amount) {
		a.withDraw(amount);
	}
	
	public void getBalance(Account a) {
		a.getBalance();
	}
	
	public void depositMoney(Account a, int amount) {
		a.deposit(amount);
	}

	public static void main(String[] args) {
		Bank b1 = new Bank();
		savingsAccount s1 = new savingsAccount(101,50000);
		Current c1 = new Current(102,60000);
		b1.withDrawMoney(s1,10000);
		b1.getBalance(s1);
		
		b1.withDrawMoney(c1, 2000);
		b1.getBalance(c1);

		
		b1.depositMoney(s1, 100000);
	}

}
