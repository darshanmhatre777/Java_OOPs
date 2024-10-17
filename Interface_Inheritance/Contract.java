package Interface_Inheritance;

public class Contract extends Employee{
	
	private int hrs;
	private int rate;

	public Contract(int empid, String name, int hrs, int rate) {
		super(empid, name);
		this.hrs=hrs;
		this.rate=rate;
	}

	@Override
	public double calculateNet() {
		 double net = hrs*rate;
		 return net;
	}

}
