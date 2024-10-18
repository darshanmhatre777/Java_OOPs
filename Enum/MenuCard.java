package emun_Practice;

public enum MenuCard {
	
	SMALL(50),MEDIUM(70), LARGE(90);
	
	private int price;
	private MenuCard(int price) {
		this.price = price;
		
	}
	 public int getPrice() {
		 return price;
	 }
	

}
