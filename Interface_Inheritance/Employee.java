package Interface_Inheritance;

public abstract class Employee {
	
	protected int empid;
	protected String name;
	
	public Employee(int empid, String name) {
		this.empid = empid;
		this.name = name;
	}

	public int getEmpid() {
		return empid;
		}

	public String getName() {
		return name;
	}


	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + "]";
		}
	

	public abstract double calculateNet();
	
}
