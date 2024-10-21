package assignment3;

import java.util.TreeSet;

public class Car {
	private int reg_no;
	private String make;
	private String model;
	private int man_year;
	private double price;
	private TreeSet<String> colours;
	public Car(int reg_no, String make, String model, int man_year, double price, TreeSet<String> colours) {
		super();
		this.reg_no = reg_no;
		this.make = make;
		this.model = model;
		this.man_year = man_year;
		this.price = price;
		this.colours = colours;
	}
	
	public int getReg_no() {
		return reg_no;
	}

	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}

	public int getMan_year() {
		return man_year;
	}
	
	public double getPrice() {
		return price;
	}
	public TreeSet<String> getColours(){
		return colours;
	}

	@Override
	public String toString() {
		return "Car [reg_no=" + reg_no + ", make=" + make + ", model=" + model + ", man_year=" + man_year + ", price="
				+ price + ", colours=" + colours + "]";
	}

}
