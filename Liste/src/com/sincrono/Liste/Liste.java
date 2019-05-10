package com.sincrono.Liste;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Liste {

	private char iniziale, finale;
	
	public Liste(char I, char F){ 
		
		iniziale=I;
		finale=F;	
		
	}
	

	

public boolean iniziale() {
	return iniziale== 'A' ;
}

public boolean finale() {
	return finale== 'o' ;
}

public char getIniziale() {
	return iniziale;
}


public void setIniziale(char iniziale) {
	this.iniziale = iniziale;
}


public char getFinale() {
	return finale;
}


public void setFinale(char finale) {
	this.finale = finale;
}
	
	
	
	
	
//	public static void main(String[] args) {
//	
//		Scanner tastiera=new Scanner(System.in);
//		String s = new String();
//		String[] Stringhe=new String[5];
//		List<String> stringhebis=new ArrayList<Stirng>();
//		List<Integer> listainteri=newArrayList<Integer>();
//		Set<String> set =new HashSet<String>();
//		Set.add("Michele");
//		Set.add("Andrea");
//		Set.add("Luca");
//		Set.add("Pippo");
//}

}
