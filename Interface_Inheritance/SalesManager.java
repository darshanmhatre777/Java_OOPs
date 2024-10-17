package Interface_Inheritance;

public class SalesManager extends Manager implements Taxpayer {
	
	protected int incentives;

	public SalesManager(int empid, String name, int basic, int allowances, int incentives) {
		super(empid, name, basic, allowances);
		this.incentives=incentives;
		
	}
	 public double calculateGross() {
		 return super.calculateGross()+incentives;
	 	} 
	}


	

