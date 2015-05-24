import java.util.*;

public class CoinChanger {
	
	private final int PENNY = 1;
	private final int NICKEL = 5;
	private final int DIME = 10;
	private final int QUARTER = 25;
	
	private int[] COINS = { QUARTER, DIME, NICKEL, PENNY };
	
	public ArrayList<Integer> makeChange(int cents) {
		ArrayList<Integer> returnedCoins = new ArrayList<Integer>(cents);
		for (int coinIndex = 0; coinIndex < COINS.length; coinIndex++) {
			while (cents >= COINS[coinIndex]){
				returnedCoins.add(COINS[coinIndex]);
				cents -= COINS[coinIndex];
			}
		}
		return returnedCoins;
	}

}