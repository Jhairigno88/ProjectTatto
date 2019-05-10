package com.sincrono.Liste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Testliste {
	
	
	public static void main(String[] args) {
	
		
		int i, s, pos=0 ;
		String nomecorto="";
		String nomelungo= "";
		Scanner testo= new Scanner(System.in);
		Scanner slot= new Scanner(System.in);
//		String s1="Costantino", s2= "Luca", s3="Gianmarco", 
//			   s4="Alessandro", s5="Mirko", s6="Paolo";	
		
		
		List<String> nomi=new ArrayList<String>();
		List<String> cognomi=new ArrayList<String>();	
		
		System.out.println("Ciao! inserisci il numero di slot che preferisci avere.");
		s=slot.nextInt();
		
		for(i=0;i<s;i++) {
			System.out.println("Inserisci un nome e cognome: ");
			nomi.add(testo.next());
			cognomi.add(testo.nextLine());
		}		
System.out.println("L'ultimo cognome della lista di cognomi è "+cognomi.get(nomi.size()-1));
System.out.println("Il primo nome della lista di nomi è "+ nomi.get(0));

	for(pos=0;nomi.size()>pos;pos++) {
		if (nomelungo.length()<(nomi.get(pos).length()))
			nomelungo=nomi.get(pos);
	}
System.out.println("il nome più lungo tra quelli inseriti è: "+nomelungo+ " che si trova in posizione:" + nomi.indexOf(nomelungo));


	for(i=0;i<nomi.size();i++) {
	if (nomi.get(i).startsWith("A") && nomi.get(i).endsWith("o"))   
		System.out.println(nomi.get(i));
	}
	System.out.println("Sono i nomi che iniziano per A e finiscono per o!");
	System.out.println("I nomi che iniziano per C compresi tra 5 e 10 caratteri sono");
	for(i=0;i<nomi.size();i++){
		if (nomi.get(i).startsWith("C") && 5<nomi.get(i).length() && nomi.get(i).length()<10) {
			System.out.println(nomi.get(i));
			System.out.println("di "+nomi.get(i).length()+" Caratteri");
		}	
	}
	System.out.println("Ecco i nomi che contengono 'ina' al loro interno: ");
	for (i=0;i<nomi.size(); i++) {
		if (nomi.get(i).contains("ina")) { 
			System.out.println(nomi.get(i));
			System.out.println("ed ecco la sua iniziale del nome: ");
			System.out.println(nomi.get(i).charAt(0));
		}
	}
System.out.println("il nome più corto è");
int indice1=0;
for (i=0; i<nomi.size();i++) {
	if(nomi.get(i).length()<nomi.get(indice1).length()) {
		nomecorto=nomi.get(i);
		System.out.println(nomecorto);
		System.out.println("composto da " + nomi.get(i).length()+" caratteri");
		
		}
}
	String change;
	String al = "alessandro";
for (i=0; i<nomi.size();i++) {
	if (nomi.get(i).length()==8) {
		System.out.println("nome di 6 lettere: "+nomi.get(i));
		nomi.set(i, al);
		System.out.println("cambiato con :"+nomi.get(i));
}
	
	int nomic=0;
 for (i=0;i<nomi.size();i++) {
	 nomic=(nomi.get(i).length()+ cognomi.get(i).length()+nomic);
	 }
 System.out.println("la lunghezza totale delle stringhe è di "+nomic+" caratteri");
}

	}
}
