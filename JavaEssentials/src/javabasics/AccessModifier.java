package javabasics;

public class AccessModifier {
	
	public static void main(String[] args) {
		
		// WAP for verifying variable and methods accessibility
		// take a class BankUser ->  with  variable as balance ,name
		// balance -> private property
		// name ->  should be a public property 
		// showBalance() method which is a public method to print balance
		// showName() method as protected method .		
		// Create a inherited class as TestUser  from BankUser to ShowName();
				
		BankUser bankUser = new BankUser();		
		System.out.println("Bank Balance - "+ bankUser.showBalance());
		System.out.println("user name - "+ bankUser.showName());
		TestUser testUser = new TestUser();
		System.out.println("user name from child - "+ testUser.showName());
		
		
		Father father = new Father();
		System.out.println("park name - "+ father.park );
		System.out.println("method park name - "+ father.showPark());
		System.out.println("protected name - "+ father.hero);
		System.out.println("method protected hero name - "+ father.showHero());
		
		
		
		
	}

}




	



class Father{
	
	protected String hero = "iam hero";
	private double bankMoney;
	public String park;
	
	private String showLetters() {
		return "Shwimg letters";
	}
	
	private double showMoney() {
		return bankMoney;
	}
	
	public String showPark() {
		return park;
	}
	
	protected String showHero() {
		return hero;
	}
}
