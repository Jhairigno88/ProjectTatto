package com.sincorno.test;

import java.util.Scanner;

import com.sincrono.Liste.Persona;
import com.sincrono.Mezzi.Bicicletta;

public class TestA3Persone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	// Realizzare 3 persone di cui almeno 1 maggiorenne e di sesso femminile.
	// Stampare il cognome delle minorenni e il sesso dei maggiorenni.
	
		Persona p, p1, p2, p3, p4, p5; // dichiarazioni variabili
		Bicicletta b;
		int km, km1;
		
//		p= new Persona("Alessandro", "Finisio",17,'m','y');
		p1=new Persona();//("Sara", "De Vincenzi", 17,'f','y');
		
		//p1= dichiarazione variabile di tipo persona.
		//new Persona() = creazione di nuova instanza.
		//Persona() = metodo costruttore.
		//Persona("sara","De Vincenzi",17,'17','y')=instanziazione mediante metodo costruttore.
		
//		p2=new Persona("Manuela", "Arcuri", 15, 'f','y');
//		p3=new Persona("Giorgia", "Pascucci", 16, 'f','n');
//		p4=new Persona("Zinedine", "Zidane", 15, 'm','n');
//		p5=new Persona("Ilaria", "Annarilli", 26,'f','y');
        b=new Bicicletta("Shimano", "mountain bike", 18, 2019, 2, 'd', 0);
		Scanner inputTastiera=new Scanner(System.in);
        System.out.println("inseire un cognome:" );
        p1.setCognome(inputTastiera.nextLine());
        System.out.println("il cognome della persona è "+p1.getCognome());
        System.out.println("inserire un nome:");
        p1.setNome(inputTastiera.next());
        System.out.println("il nome della persona è:"+p1.getNome());
        System.out.println("ora inserisci un età:");
        p1.setEta(inputTastiera.nextInt());
        System.out.println("l'età della persona è di:"+ p1.getEta());
        System.out.println("inserisci il sesso:");
        p1.setSex(inputTastiera.next().charAt(0));
        System.out.println(" il sesso della persona è: "+p1.getSex());
        
        System.out.println(" inserire Y o N a seconda se la persona ha o meno i soldi.");
		
		if( p1.Donna() && p1.soldi()) {
			System.out.println(p1.getNome()+ " "+p1.getCognome()+" ha i soldi per acquistare una "+b.getMarca()+" a "+b.getRapporti()+" rapporti"+" con cui andare a lavoro!");
		    for( km=0; km<26; km++) {
		    	b.setKm(b.getKm()+1);}
		    	System.out.println("percorrendo "+b.getKm()+" km");
		}
		
		if( !p1.Donna() && p1.soldi()) {
			System.out.println(p1.getNome()+ " "+p1.getCognome()+" non è una femmina e non ha i soldi per acquistare una " + b.getMarca());
		}
		
//		if( p2.Donna() && p2.soldi()) {
//			System.out.println(p2.getNome()+ " "+p2.getCognome()+" ha i soldi per acquistare una "+b.getMarca()+" a "+b.getRapporti()+" rapporti"+" con cui andare a lavoro!");
//			b.setKm(0);// resetta la variabile km per poter iniziare un nuovo ciclo.
//			 for( km=0; km<86; km++) {
//			    	b.setKm(b.getKm()+1);}
//			    	System.out.println("percorrendo "+b.getKm()+" km");
//			
//		}
//		if( !p2.Donna() && !p2.soldi()) {
//			System.out.println(p2.getNome()+ " "+p2.getCognome()+" non è una femmina e non ha i soldi per acquistare una " + b.getMarca());
//		}
//		
//		if( p3.Donna() && p3.soldi()) {
//			System.out.println(p3.getNome()+ " "+p3.getCognome()+ " ha i soldi per acquistare una "+b.getMarca()+" a "+b.getRapporti()+" rapporti"+" con cui andare a lavoro!");
//		}
//		if( !p3.Donna() && !p2.soldi()) {
//			System.out.println(p3.getNome()+ " "+p3.getCognome()+" non è una femmina e non ha i soldi per acquistare una " + b.getMarca());
//		}
//		
//		if( p5.Donna() && p5.soldi()) {
//			System.out.println(p5.getNome()+ " "+p5.getCognome()+" ha i soldi per acquistare una "+b.getMarca()+" a "+b.getRapporti()+" rapporti"+" con cui andare a lavoro!");
//		}
//		if( !p5.Donna() && !p5.soldi()) {
//			System.out.println(p5.getNome()+ " "+p5.getCognome()+" non è una femmina e non ha i soldi per acquistare una " + b.getMarca());
//		}
//		
//		if( p.Donna() && p.soldi()) {
//			System.out.println(p.getNome()+ " "+p.getCognome()+ " ha i soldi per acquistare una "+b.getMarca()+" a "+b.getRapporti()+" rapporti"+" con cui andare a lavoro!");
//		}
//		if( !p.Donna() && !p.soldi()) {
//			System.out.println(p.getNome()+ " "+p.getCognome()+" non è una femmina e non ha i soldi per acquistare una " + b.getMarca());
//		}
//		
//		if( p4.Donna() && p4.soldi()) {
//			System.out.println(p4.getNome()+ " "+p4.getCognome()+" è un adolescente!");
//		}
//		if( !p4.Donna() && !p4.soldi()) {
//			System.out.println(p4.getNome()+ " "+p4.getCognome()+" non è una femmina e non ha i soldi per acquistare una " + b.getMarca());
//		}
}
}


