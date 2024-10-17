package Interface_Inheritance;

public class Manager extends salaried implements Taxpayer {
	protected int allowances;

	public Manager(int empid, String  name, int basic, int allowances) {
		super(empid, name, basic);
		this.allowances=allowances;	
	}
	
	@Override
	public double calculateGross() {
		return super.calculateGross()+allowances;
	}

}

