package it.corso.sezione_01;

public class Calcolatrice {

	public static void main(String[] args) {
		
		
		Calcolatore c = new Calcolatore();
		
		double a = 10;
		double b = 20;
		
		System.out.println("La somma di a+b = " + c.somma(a, b));
		System.out.println("La sottrazione di a-b = " + c.sottrazione(a, b));
		System.out.println("La molteplicazione di a*b = " + c.moltiplicazione(a, b));
		System.out.println("La divisione di a/b = " + c.divisione(a, b));

	}

}
