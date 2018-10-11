package it.corso.sezione_01;

/**
 * <b>Classe Calcolatore</b><br><br>
 * <Pre>Classe che implementa le operazioni aritmetiche.<br>
 * I metodi implementati consentono di effetuare le seguenti operazioni:</Pre>
 * <ul>
 * <li>Somma</li>
 * <li>Sottrazione</li>
 * <li>Moltiplicazione</li>
 * <li>Divisione</li>
 * </ul>
 * 
 * @author GB
 * @since 1.0
 */

public class Calcolatore {
	
	public double somma(double a, double b) {
		return a+b;
	}

	public double sottrazione(double a, double b) {
		return a-b;
	}
	
	public double moltiplicazione(double a, double b) {
		return a*b;
	}
	
	public double divisione(double a, double b) {
		return a/b;
	}
}
