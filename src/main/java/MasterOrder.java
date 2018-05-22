import java.awt.List;
import java.util.ArrayList;

public class MasterOrder {

	ArrayList<CookieOrder> orders = new ArrayList<>();

	public int getTotalBoxes() {
		// TODO Auto-generated method stub
		// return 1;
		// auto create was "return 0"
		// you changed it to 1 to run the test
		// then you changed it entirely to make better tests

		// this for loop will keep counting, no matter how many boxes were
		// ordered
		int boxes = 0;
		for (CookieOrder order : orders) {
			boxes += order.getNumBoxes();
		}
		return boxes;
	}

	public void addOrder(CookieOrder cookieOrder) {
		// TODO Auto-generated method stub
		orders.add(cookieOrder);

	}

	public void removeVarietyByString(String variety) {
		// TODO Auto-generated method stub

		// you created this loop first, when you just removed one item:

		/*
		 * for (CookieOrder order : orders) { if
		 * (order.getVariety().equals(variety)) { orders.remove(order); } }
		 */

		// and you created this later, when you wanted to remove multiples

		for (int i = orders.size()-1; i >= 0; i--) {
			if (orders.get(i).getVariety().equals(variety)) {
				orders.remove(i);
			}
		}

		// the first loop wouldn't work with multiple removals
		// because removing one item reorganized the ArrayList or something
		// so a regular for loop will go through each one regardless
		// tbh I missed the exact explanation.

	}
	
	public void showOrder(){
		for(CookieOrder order: orders){
			System.out.println("Variety: " + order.getVariety() + " Boxes: " + order.getNumBoxes());
		}
	}
}
