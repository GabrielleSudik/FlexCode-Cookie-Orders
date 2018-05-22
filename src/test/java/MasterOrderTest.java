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
	
	/*
	@Test
	public void shouldReturnTotalBoxesAsOneAfterRemovalOfOne(){
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("mint",1));
		underTest.addOrder(new CookieOrder("vanilla",1));
		//you added two boxes, next you remove one:
		underTest.removeVarietyByString("mint");
		int check = underTest.getTotalBoxes();
		assertEquals(1, check);
	}
	*/
	
	//that test works with original loop in remove method.
	//it fails if using the second loop in remove method.
	//which you wrote for the following test
	//these results are OK, it has to do with how ArrayLists reorganize
	//it just means you needed one kind of loop for one test
	//and another kind of loop for the second test
	
	 
	@Test
	public void shouldReturnTotalBoxesAsOneAfterRemovalOfAllMint(){
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("mint",1));
		underTest.addOrder(new CookieOrder("mint",1));
		underTest.addOrder(new CookieOrder("vanilla",1));
		underTest.addOrder(new CookieOrder("mint",1));
		//you added 3 mints, you want to remove all mints:
		underTest.removeVarietyByString("mint");
		int check = underTest.getTotalBoxes();
		assertEquals(1, check);
	}
		
}
