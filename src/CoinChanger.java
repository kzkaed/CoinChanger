import java.util.*;

public class CoinChanger {
	
	private final int PENNY = 1;
	private final int NICKEL = 5;
	private final int DIME = 10;
	private final int QUARTER = 25;
	
	public ArrayList<Integer> makeChange(int cents) {
		ArrayList<Integer> returnedCoins = new ArrayList<Integer>(cents);
		while (cents >= QUARTER){
			returnedCoins.add(QUARTER);
			cents -= QUARTER;
		}
		
		
		while (cents >= DIME){
			returnedCoins.add(DIME);
			cents -= DIME;
		}
		
		while(cents >= NICKEL){
			returnedCoins.add(NICKEL);
			cents -= NICKEL;
		}
		for (int i = 0; i < cents; i++){
				returnedCoins.add(PENNY);
		}
		return returnedCoins;
	}

}