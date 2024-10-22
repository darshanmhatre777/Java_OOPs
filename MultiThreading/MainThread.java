package MultiThreading;

public class MainThread {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread t2 = new Thread2();
		
		t1.start();
		t2.start();
		t1.setName("darshan");
		t2.setName("Ankur");
		 
	}

}
