package it.corso.sezione_05;

public class Main {
	
	public static void main(String[] args) {
		
		int num1 = 2;
		int num2 = 3;
		int num3 = 4;
		
		IfElseSwitchCase oggCercaMaggiore = new IfElseSwitchCase();
		
		System.out.println("Di questi 3 numeri: " + num1 + ", " + num2 + ", " + num3);
		System.out.println("Il numero maggiore è " + oggCercaMaggiore.recuperaIlMaggiore(num1, num2, num3));
		
	}
}
