package org.lessons.java.shop;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		Prodotto[] prodotti = new Prodotto[20];
		int prodottiL = prodotti.length;

		Random rand = new Random();
        for (int i=0; i<prodottiL; i++) {
			
			Prodotto prod = new Prodotto("Prod" + (i + 1), 
						"prodotto eccezzionale", 
						rand.nextFloat(50));
			
			prodotti[i] = prod;
		}

     for (int i=0; i<prodottiL; i++) {
	     Prodotto prod = prodotti[i];
	     System.out.println("*Nome intero prodotto: " + prod.getFullName());
	     System.out.println("*Codice: " + prod.getCode() + "    " + "*Prodotto: " + prod.getName());
	     System.out.println("*Prezzo noIVA: €" +  String.format("%.2f",prod.getPrice()) + "     " + "*Prezzo con IVA: €" + String.format("%.2f",prod.getFullPrice()));
	     System.out.println("*Descrizione: " + prod.getDescription());
	     System.out.println("-------------------------------------------------------");
	}
	}
}
