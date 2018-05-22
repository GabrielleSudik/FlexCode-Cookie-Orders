import java.util.Scanner;


public class CookieOrderApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		MasterOrder myOrder1 = new MasterOrder();
		myOrder1.addOrder(new CookieOrder("Peanut", 2));
		myOrder1.addOrder(new CookieOrder("Mint", 3));
		myOrder1.addOrder(new CookieOrder("Coconut", 3));
		myOrder1.addOrder(new CookieOrder("Chocolate", 2));

		System.out.println("Total boxes ordered: " + myOrder1.getTotalBoxes());
	
		System.out.println("Your preliminary order:");
		myOrder1.showOrder();
		
		System.out.println("What variety would you like to remove? (type variety or none)");
		String varietyToRemove = input.nextLine();
		
		System.out.println("You are removing " + varietyToRemove);
		myOrder1.removeVarietyByString(varietyToRemove);
		
		System.out.println("Your final order:");
		System.out.println("Total boxes ordered: " + myOrder1.getTotalBoxes());
		myOrder1.showOrder();
		
	}

}
