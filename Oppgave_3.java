package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave_3 {
	
	static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));
	}

	public static void main(String[] args) {
		String tallTxt = showInputDialog("Tall? ");
		int tall = Integer.parseInt(tallTxt);
		  int i,fact=1;  
	   
		  fact = factorial(tall);   
		  
		  System.out.println("Faktoren av "+tall+" er "+ fact);
		  String utTekst = ("Faktoren av "+tall+"er "+ fact);
		  showMessageDialog(null, utTekst);
		  
		

	}


}
