package jana60.bank;

import java.util.Random;

public class Conto {
	private int bankNum;
	private String name;
	private double balance = 0;
	public boolean online = false;
	
	public Conto(String name) {
		online = true;
		Random rand = new Random();
		int ranNum = rand.nextInt(1000 + 1 - 1) + 1;
		bankNum = ranNum;
		setName(name);
		
	}
	
	//----------------------------------------------------------------------------//
	public int getBankNum() {
		
		return bankNum;
	}
	
	//---------------------------------------------------------------------------//
    public double getBalance() {
		
		return balance;
	}
//----------------------------------------------------------------------------------//
	public String getName() {
		
		return name;
	}
	public void  setName(String name) {
		
		this.name = name;
	}
	//----------------------------------------------------------------------------------//
	
	//--------------------VERSARE---------------------------------------//
public void  versamento(int value) {
	
		balance += value;
		System.out.println("il versamento è andato a buon fine.");
		System.out.println("il tuo bilancio attuale è di: *" + String.format("%.2f",getBalance()));
	}
//--------------------PRELEVARE---------------------------------------//
public void  prelievo(int value) {
	if(balance < value) {
		System.out.println("non puoi prelevare: " + value + ", il tuo credito è di: *" + String.format("%.2f",getBalance()));
	}
		balance -= value;
	}
//-------------------------INFO GENERALI-------------------------------------------///
public void  info() {
		System.out.println("*numero conto: " + getBankNum()+ " *nome utente: " + getName());
		System.out.println("*Bilancio: " + String.format("%.2f",getBalance()));
}
	
	
}
