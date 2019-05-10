package com.sincorno.test;

import com.sincrono.Liste.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p, p1, p2; // dichiarazioni variabili

		
		
//		p= new Persona(); // creazione dell'istanza.
//		p.setNome("Alessandro");
//		p.setCognome("Finisio");
//		p.setEta(30);
//		p.setSex('m');
//		
//		p1=new Persona();
//		p1.setNome("Gennaro");
//		p1.setCognome("Santini");
//		p1.setEta(20);
//		p1.setSex('m'); 
		
		
		int i;
		
		
		if(p.getEta()>p1.getEta()) {
			System.out.println(p.getNome()+ " è la persona più anziana del gruppo");
			System.out.println(p1.getNome()+" è la persona più giovane del gruppo");
		
		if (p1.getEta() >18){
				for (i=0; i<3; i++)
						{System.out.println(p1.getEta());
						}
				}
					else {
					System.out.println(p1.getNome()+" non è minorenne!");	
					}		
				}
				
		
			
		else{
				System.out.println(p1.getNome()+ " è la persona più anziana del gruppo ");
				System.out.println(p.getNome()+" è la persona più giovane del gruppo");
				if (p1.getEta() >18 && p1.getEta()<p.getEta()){
						
					for (i=0; i<3; i++)
							{System.out.println(p.getEta());}
					}
						else {
						System.out.println(p.getNome()+" non è minorenne!");	
						}	
		
			
			}
		
		if (p1.isaWoman()&&p.isaWoman()) {
			System.out.println("Il fatto che entrambe sono donne è:"+p.isaWoman());
			}
		else {
			System.out.println(" non sono entrambe donne");
		}
			
			}
		}
	


