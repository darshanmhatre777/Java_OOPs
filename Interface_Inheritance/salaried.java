package Interface_Inheritance;

public class salaried extends Employee implements Taxpayer{
	private int basic;

	public salaried(int empid, String name, int basic) {
		super(empid, name);
		this.basic = basic;
		
	}
	
	public double calculateGross() {
		double hra = basic*0.04;
		double da = basic*0.12;
		double gross = hra + da + basic;
		return gross;
		
	}
	
	public double calculateTax() {
		double gross = calculateGross();  //the Scope of gross variable in above function is finished in function itself 
										 // hence we calculategross() again in this function or we will have NULLPOINTEREXCEPTION
		double tax = gross*0.1;
		return tax;
	}
	
	public double calculateNet() {
		double gross = calculateGross();
		double tax = calculateTax();
		double net = gross - tax;
		return net;
			
	}



}
