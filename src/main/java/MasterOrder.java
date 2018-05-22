import java.awt.List;
import java.util.ArrayList;


public class MasterOrder {
	
	ArrayList<CookieOrder> orders = new ArrayList<>();

	public int getTotalBoxes() {
		// TODO Auto-generated method stub
		//return 1;
		//auto create was "return 0"
		//you changed it to 1 to run the test
		//then you changed it entirely to make better tests
		
		//this for loop will keep counting, no matter how many boxes were ordered
		int boxes = 0;
		for (CookieOrder order: orders){
			boxes += order.getNumBoxes();
		}
		return boxes;
	}

	public void addOrder(CookieOrder cookieOrder) {
		// TODO Auto-generated method stub
		orders.add(cookieOrder);
		
	}

}
