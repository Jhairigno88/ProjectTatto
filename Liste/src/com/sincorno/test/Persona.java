package com.sincorno.test;

import com.sincrono.Eccezioni.Eccezioni;

public class Persona {
	public Persona() {}    //costruttore di defoult. Firma con 0 parametri.
	public Persona (String nom, String cognom, int e,char s, char y, char X) { //costruttore con dati definiti.
	nome=nom;                                                  //Firma con 4 parametri.    
	cognome=cognom;
	eta=e;
	sex=s;
	soldi=y;
	iniziale=X;
	}
	
	public Persona (String nom, String cognom, int e, char x){ //costruttore con dati definiti.
		nome=nom;                                      //Firma con 3 parametri.
		cognome=cognom;
		eta=e;
		
		}
		private String nome; // privatizzazione degli attributi al fine
		private String cognome;
		private String residenza;
												// di evitarne lo stravolgimento da parte di terzi.
		private int eta;
		private char sex,soldi,iniziale;
		
		public String getNome() {
				return nome;
			}
			public void setNome(String nome) throws Eccezioni {
				if(nome.length()<=5) {
					throw new Eccezioni("nome troppo corto!");
					}this.nome=nome;
			}
			
		public boolean Donna() { //creazione metodo booleano.
			return sex=='f';
		}
		
		public boolean maggiorenne() {
			return eta<18;
		}
		public boolean Adolescente() {
			return eta>14 && eta<18;
		}
		
		public boolean Iniziale() {
			return iniziale=='A';
		}
		
		public boolean soldi() {
			return soldi=='y';
		}
		
			public String getResidenza() {
			return residenza;
			}
			public void setResidenza(String e) {
				residenza=e;
			}
		
		public String getCognome() {  //metodo getter per prelevare l'attributo
			return cognome;           //precedentemente reso privato    
		}
		public void setCognome(String e) { //metodo setter per permettere l'utilizzo
			cognome=e;					   //dell'attributo prelevato precedentmente dal getter.
		}
		
	

		
		
		public char getSex() {
			return sex;
			}
		public void setSex(char e) {
			sex=e;
		}
		
//		public boolean isWoman() {   metodo scolsatico di creaizone di metodo booleano.
//		 if( sex=='f'|| sex=='F') 
//			 return true;			
//		
//		 else
//				 return false;
//		}
		
		public boolean isaWoman() { //metodo più elegante per la creazione dello stesso metodo Boolean.
			boolean donna=false;
			if (sex=='f' || sex=='F');
			donna=!donna;
			return donna;
		}
		
		
			public int getEta() { //IL GET SERVE PER ANDARE A RIPRENDERE METODI RESI PRIVATE.
				return eta;
			}
			public void setEta(int e) { //IL SET SERVE PER ANDARE settare i metodi richiamati con get.
				eta=e;
			}
	
		public void acquista () {
			
			System.out.println(" ha acquistato");
		}
		
		public void mangiare() { 
		//all'interno del metodo andremo ad inserire una qualche istruzione.
		
			System.out.println("sto mangiando");
		}
		public void bere() {
			
			System.out.println("sto bevendo");
		}
		
		public void respirare() {
			
			System.out.println("sto respirando");
		}
		public char getIniziale() {
			return iniziale;
		}
		public void setIniziale(char iniziale) {
			this.iniziale = iniziale;
		}
		

		
			
				
			
		}
		
	

