package Matches;

import java.util.Random;

public class Ordinateur {
	public int propositionOrdinateur() {
		
		Random random = new Random();
		int nb;
		nb = (random.nextInt(3)+1);
		return nb;
	
	}
}
