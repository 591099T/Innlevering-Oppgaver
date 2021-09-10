package no.hvl.dat100;

import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave_2 {
	public static void main(String[] args) {
	
	String karakter = null;
	
	for ( int i = 1; i <= 10; i++) {
		String tallTxt = javax.swing.JOptionPane.showInputDialog("Tall? ");
		int poeng = Integer.parseInt(tallTxt);
	
		
		if(poeng>100) { 
			tallTxt = javax.swing.JOptionPane.showInputDialog("Error: skriv in på nytt  ");
			poeng = Integer.parseInt(tallTxt);
					
	}else if(poeng <0) {
			tallTxt = javax.swing.JOptionPane.showInputDialog("Error: skriv in på nytt  ");
			poeng = Integer.parseInt(tallTxt);
			
		} else {
			
		
			 if (poeng<=39) {
				karakter="F";
			}else if(poeng<=49) {
				karakter = "E";
			}else if(poeng<=59) {
				karakter = "D";
			}else if(poeng<=79) {
				karakter = "C";
			}else if(poeng<=89) {
				karakter = "B";
			}else 
				karakter = "A";
		}
		
		String utTekst = "Karakter " + karakter;
		
		showMessageDialog(null, utTekst);
		System.out.println( karakter);
		}

}

}
