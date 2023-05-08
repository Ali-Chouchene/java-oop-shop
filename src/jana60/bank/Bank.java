package jana60.bank;

import java.util.Scanner;

public class Bank {
	
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il nome per la creazione del conto");
		String nome = input.nextLine();
        String scelta = "";
		Conto conto = new Conto(nome);
		
		if(conto.online) {
			System.out.println("se vuoi versare una somma sul tuo conto digita 1.");
			System.out.println("se vuoi prelevare una somma dal tuo conto digita 2.");
			System.out.println("se vuoi uscire digita 3.");
			scelta = input.nextLine();
			azioni(scelta, conto);
			input.close();
		}
		
		 
		
		
	}
	public static void azioni(String scelta, Conto conto) {
		Scanner input = new Scanner(System.in);
		if(scelta == "1") {
			System.out.println("quale somma vuoi versare?");
			String somma = input.nextLine();
			conto.versamento(Integer.parseInt(somma));
			scelta = "";
			
		}
	else if(scelta == "2") {
			System.out.println("quale somma vuoi prelevare?");
			String somma = input.nextLine();
			conto.prelievo(Integer.parseInt(somma));
			scelta = "";
			
		}
	else if (scelta == "3") {
			conto.online = false;
			System.out.println("Grazie e arrivederci.");
			conto.info();
			input.close();
		}
	}
}
