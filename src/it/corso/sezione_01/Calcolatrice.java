package it.corso.sezione_01;

/**
 * <b>Classe Calcolatrice</b><br><br>
 * Questa classe contiene: <br>
 * <ul>
 * <li>Il metodo <b>Main</b> del progetto</li>
 * <li>Istanzia in c la classe calcolatore</li>
 * <li>Assegna a due variabili a è b i valori</li>
 * <li>Stampa ogni metodo richiamato con i valori delle variabili</li>
 * </ul>
 * @author GB
 * @since 1.0
 * @version 1.0 @date: 10-10-2018
 */

public class Calcolatrice {
	
	/**
	 * @param args
	 * 
	 */
	
	public static void main(String[] args) {
		
		/*Istanza della classe calcolatore */
		Calcolatore c = new Calcolatore();
	
		double a = 10;
		double b = 20;
		
		System.out.println("La somma di a+b = " + c.somma(a, b));
		System.out.println("La sottrazione di a-b = " + c.sottrazione(a, b));
		System.out.println("La molteplicazione di a*b = " + c.moltiplicazione(a, b));
		System.out.println("La divisione di a/b = " + c.divisione(a, b));

	}

}
