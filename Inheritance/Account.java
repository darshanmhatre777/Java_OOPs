package Inheritance;

public abstract class Account {
	
	protected int accid;
	protected double balance;
	
	public Account(int accid, double balance) {
		this.accid=accid;
		this.balance=balance;
	}

	public int getAccid() {
		return accid;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [accid=" + accid + ", balance=" + balance + "]";
	}
	
	public abstract void withDraw(int amount); {
		
	}

	public void deposit(int amount) {
		balance += amount;
		System.out.println(amount + " Credited to the account");
		System.out.println("Current balance : " + balance);
	}
	
	
	
}
