package Interface_Inheritance;

public class payRoll {
	
	public void calculateG(salaried e) {
		System.out.println("Gross salary for " + e.getName() + " is :" + e.calculateGross());
	}
	
	public void calculateN(Employee e) {
		System.out.println("Net salary for " + e.getName() + " is :" + e.calculateNet());
		
	}
	public void calculateT(salaried e) {
		System.out.println("Tax for " + e.getName() + " is :" + e.calculateTax());
	}

	public static void main(String[] args) {
		
		payRoll p1 = new payRoll();

			
		salaried [] emp = new salaried[5];
		emp [0] = new salaried (102,"pawan",250000);
		emp [1] = new Manager (103,"anu",250050,5600);
		emp [2] = new SalesManager (104,"ankur",254000,5600,400);
		emp [3] = new salaried(101,"soham",150000);
		emp [4] = new Manager(101,"darshan",200000,20000);
		
		
		
		p1.calculateG(emp[0]);
		p1.calculateG(emp[1]);
		p1.calculateG(emp[2]);
		p1.calculateG(emp[3]);
		p1.calculateG(emp[4]);
		
		p1.calculateN(emp[0]);
		p1.calculateN(emp[1]);
		p1.calculateN(emp[2]);
		p1.calculateN(emp[3]);
		p1.calculateN(emp[4]);
		
		p1.calculateT(emp[0]);
		p1.calculateT(emp[1]);
		p1.calculateT(emp[2]);
		p1.calculateT(emp[3]);
		p1.calculateT(emp[4]);
		
	}

}
