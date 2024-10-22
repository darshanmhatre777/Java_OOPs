package MultiThreading;

public class Thread2 extends Thread{
	
	public void run() {
		int i =0;
		for(i=0; i<5; i++) {


		System.out.println("In Run 2");
			i++;
		}
		
	try {
		sleep(5000);
		
	} catch(InterruptedException e) {
		System.out.println(e);
	}

}
}
