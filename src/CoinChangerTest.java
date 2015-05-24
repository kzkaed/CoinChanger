import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class CoinChangerTest {
	private CoinChanger changer;


	@Before
	public void setUp() {
		this.changer =  new CoinChanger();		
	}
	
	@Test
	public void test1() {
		int[] coinsArray = {1};
		ArrayList<Integer> expectedCoins = (ArrayList<Integer>) makeArrayList(coinsArray);
		assertEquals( expectedCoins , changer.makeChange(1));
	}
	
	@Test
	public void test2() {
		CoinChanger changer = new CoinChanger();
		int[] coinsArray = {1,1};
		ArrayList<Integer> expectedCoins = (ArrayList<Integer>) makeArrayList(coinsArray);
		assertEquals( expectedCoins , changer.makeChange(2));
	}
	
	@Test
	public void test3() {
		CoinChanger changer = new CoinChanger();
		int[] coinsArray = {1,1,1};
		ArrayList<Integer> expectedCoins = (ArrayList<Integer>) makeArrayList(coinsArray);
		assertEquals( expectedCoins , changer.makeChange(3));
	}
	@Test
	public void test4() {
		CoinChanger changer = new CoinChanger();
		int[] coinsArray = {1,1,1,1};
		ArrayList<Integer> expectedCoins = (ArrayList<Integer>) makeArrayList(coinsArray);
		assertEquals( expectedCoins , changer.makeChange(4));
	}
	@Test
	public void test5() {
		CoinChanger changer = new CoinChanger();
		int[] coinsArray = {5};
		ArrayList<Integer> expectedCoins = (ArrayList<Integer>) makeArrayList(coinsArray);
		assertEquals( expectedCoins , changer.makeChange(5));
	}
	@Test
	public void test6() {
		CoinChanger changer = new CoinChanger();
		int[] coinsArray = {5,1};
		ArrayList<Integer> expectedCoins = (ArrayList<Integer>) makeArrayList(coinsArray);
		assertEquals( expectedCoins , changer.makeChange(6));
	}
	@Test
	public void test7() {
		CoinChanger changer = new CoinChanger();
		int[] coinsArray = {5,1,1};
		ArrayList<Integer> expectedCoins = (ArrayList<Integer>) makeArrayList(coinsArray);
		assertEquals( expectedCoins , changer.makeChange(7));
	}
	@Test
	public void test10() {
		CoinChanger changer = new CoinChanger();
		int[] coinsArray = {10};
		ArrayList<Integer> expectedCoins = (ArrayList<Integer>) makeArrayList(coinsArray);
		assertEquals( expectedCoins , changer.makeChange(10));
	}
	
	@Test
	public void test11() {
		CoinChanger changer = new CoinChanger();
		int[] coinsArray = {10,1};
		ArrayList<Integer> expectedCoins = (ArrayList<Integer>) makeArrayList(coinsArray);
		assertEquals( expectedCoins , changer.makeChange(11));
	}
	@Test
	public void test15() {
		CoinChanger changer = new CoinChanger();
		int[] coinsArray = {10,5};
		ArrayList<Integer> expectedCoins = (ArrayList<Integer>) makeArrayList(coinsArray);
		assertEquals( expectedCoins , changer.makeChange(15));
	}
	
	@Test
	public void test19() {
		CoinChanger changer = new CoinChanger();
		int[] coinsArray = {10,5,1,1,1,1};
		ArrayList<Integer> expectedCoins = (ArrayList<Integer>) makeArrayList(coinsArray);
		assertEquals( expectedCoins , changer.makeChange(19));
	}
	
	@Test
	public void test24() {
		CoinChanger changer = new CoinChanger();
		int[] coinsArray = {10,10,1,1,1,1};
		ArrayList<Integer> expectedCoins = (ArrayList<Integer>) makeArrayList(coinsArray);
		assertEquals( expectedCoins , changer.makeChange(24));
	}
	@Test
	public void test25() {
		CoinChanger changer = new CoinChanger();
		int[] coinsArray = {25};
		ArrayList<Integer> expectedCoins = (ArrayList<Integer>) makeArrayList(coinsArray);
		assertEquals( expectedCoins , changer.makeChange(25));
	}
	
	@Test
	public void test75() {
		CoinChanger changer = new CoinChanger();
		int[] coinsArray = {25, 25,25};
		ArrayList<Integer> expectedCoins = (ArrayList<Integer>) makeArrayList(coinsArray);
		assertEquals( expectedCoins , changer.makeChange(75));
	}
	
	@Test
	public void test91() {
		CoinChanger changer = new CoinChanger();
		int[] coinsArray = {25, 25,25, 10, 5, 1};
		ArrayList<Integer> expectedCoins = (ArrayList<Integer>) makeArrayList(coinsArray);
		assertEquals( expectedCoins , changer.makeChange(91));
	}
	
	private List<Integer> makeArrayList(int[] cents){
		int[] ints = cents;
	    List<Integer> intList = new ArrayList<Integer>();
	    for (int index = 0; index < ints.length; index++)
	    {
	        intList.add(ints[index]);
	    }
	return intList;
	}


}
