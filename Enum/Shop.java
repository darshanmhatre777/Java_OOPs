package emun_Practice;

import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		
		try {
				MenuCard [] m = MenuCard.values(); //converts ENUM values into array of values
				for(MenuCard m1 : m) {
					System.out.println(m1);
				}
				
				System.out.println("Enter your choice: ");
				Scanner sc = new Scanner(System.in);
				String ch = sc.nextLine();
				MenuCard m2 = MenuCard.valueOf(ch.toUpperCase());
				
				switch (m2) {
				case SMALL: 
					System.out.println(" Please Pay :  " + m2.getPrice());
					break;
				case MEDIUM:
						System.out.println(" Please Pay :  " + m2.getPrice());
						break;
				case LARGE:
					System.out.println(" Please Pay :  " + m2.getPrice());
					break;
				default:
					System.out.println("Invalid Choice");
				
				}
				System.out.println(" Your Order has been placed. ");
				sc.close();
			
			
		}catch(Exception e){
			System.out.println(e);
			
		}
		

	}

}
