package com.sincorno.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class TestListePersone {

	public static void main(String[] args) {
		Scanner slot= new Scanner(System.in);
		Scanner testo= new Scanner(System.in);
		Scanner anni= new Scanner(System.in);
		Scanner sex=new Scanner(System.in);
		
		Persona Giovane,Vecchio;
		int i, s, e;
		List<Persona> Perso=new ArrayList<Persona>();
		
		
		System.out.println("Ciao! inserisci il numero di slot che preferisci avere.");
		s=slot.nextInt();
		
//creazione della lista di Persona(inteso come classe)
		for(i=0;i<s;i++) {
			System.out.println("Ora inserisci il nome, Cognome, e l'età della persona che vuoi nella lista:");
			Persona per=new Persona();
			per.setNome(testo.next());
			per.setCognome(testo.next());
			e=anni.nextInt();
			per.setEta(e);
			Perso.add(per);
		}	
//Stampa a video i primi tre nomi della Lista.
for(i=0;i<3;i++) {}
System.out.println("I primi tre nomi della lista sono:");
System.out.println( Perso.get(0).getNome()+" "+Perso.get(1).getNome()+" "+Perso.get(2).getNome());
		
//	System.out.println("i primi tre nomi della lista sono: ");
//	System.out.println(Perso.get(0).getNome());
//	System.out.println(Perso.get(1).getNome());
//	System.out.println(Perso.get(2).getNome());
		
//Stampare il nominativo del più giovane e del più anziano

Giovane=Perso.get(0);
Vecchio=Perso.get(0);
for(i=0;i<s;i++) {
		if (Giovane.getEta()>Perso.get(i).getEta()){
			Giovane=Perso.get(i);
					}
		else if(Vecchio.getEta()<Perso.get(i).getEta()){
			Vecchio=Perso.get(i);
					}
	}
	System.out.println("La persona più giovane é: "+ Giovane.getNome()+" "+Giovane.getCognome());
	System.out.println("La persona più anziana é: "+ Vecchio.getNome()+" "+Vecchio.getCognome());
	
// eliminare dalla lista le persone minorenni e con cognome di almeno 8 caratteri.	
	int np=Perso.size();
	for(i=0;i<np;i++) {
	if(!(Perso.get(i).maggiorenne())&& Perso.get(i).getCognome().length()==8)  {
			Perso.remove(i);
			
			np=Perso.size();// variabili che aggiorna la 
			i=0;			//lungezza della lista dopo le eliminzaizoni
			
	}  
	}
//Stampare a video i nomi restanti dalla lita modificata.
	System.out.println("Le persone non eliminate dalla lista sono: ");
	for(i=0;i<Perso.size();i++) {	
		System.out.println(Perso.get(i).getNome()+" "+Perso.get(i).getCognome());

}
	
	
	
	

	
	
	
	
	
	
	
	}
}
	




