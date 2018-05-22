import static org.junit.Assert.*;

import org.junit.Test;


public class MasterOrderTest {

	@Test
	public void shouldReturnTotalBoxesAsOne(){
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("",1));
		int check = underTest.getTotalBoxes();
		assertEquals(1, check);
	}
	
	@Test
	public void shouldReturnTotalBoxesAsTwo(){
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("",1));
		underTest.addOrder(new CookieOrder("",1));
		//we did that line twice to add two orders
		int check = underTest.getTotalBoxes();
		assertEquals(2, check);
	}
}
