package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave_1 {
	
	public static void main(String[] args) {
		double skatt=0,it;
		String tallTxt = showInputDialog("Tall? ");
		int tall = Integer.parseInt(tallTxt);
		
		it=tall;
		if(it<=184800)
			skatt=0;
		else if(it<=260100)
			skatt=0.017*(it-184800);
		
		else if(it<=651250)
			skatt=(0.04*(it-260100))+(0.017*(260100-184800));
		
		else if(it<=1021550)
			skatt=(0.132*(it-651250))+(0.04*(651250-260100))+(0.017*(260100-184800));
		
		else
			skatt=(0.162*(it-1021550))+(0.132*(1021550-651250))+(0.04*(651250-260100))+(0.017*(260100-184800));
		System.out.println("Skatten din er "+skatt);
		String utTekst = ("Skatten din er "+skatt);
		  showMessageDialog(null, utTekst);
	}

}
