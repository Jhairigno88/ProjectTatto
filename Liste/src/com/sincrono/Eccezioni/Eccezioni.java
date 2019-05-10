package com.sincrono.Eccezioni;


public class Eccezioni extends RuntimeException{

	
	
	public Eccezioni() {
	//	System.out.println("Hai inserito un nome più corto di 5 caratteri");
		
	}

	public Eccezioni(String messaggio) {
		super(messaggio);
		// TODO Auto-generated constructor stub
	}

}
