package it.corso.sezione_05;

/**
 * 
 * <h3>Classe IfElseSwitchCase</h3>
 * Classe con il metodo <b>recuperaIlMaggiore</b><br>
 * che trova il valore piu grande di 3 numeri passati.
 * 
 * @author GB
 * 
 * @since 1.0
 * 
 * @version 1.0 date: 10/10/2018
 */

public class IfElseSwitchCase {
	
	public int recuperaIlMaggiore(int num1, int num2, int num3) {
		
		int maggiore = 0;
		if(num1>num2 && num1>num3) {
			maggiore = num1;
		} else if(num2>num1 && num2>num3) {
			maggiore = num2;
		} else {
			maggiore = num3;
		}
		
		return maggiore;
		
	}

}
