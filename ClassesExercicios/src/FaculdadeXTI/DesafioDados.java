package FaculdadeXTI;


import java.util.Random;

import javax.swing.JOptionPane;


public class DesafioDados {

	public static void main (String[] args){
		
		
		String palpite = JOptionPane.showInputDialog("Qual � o seu palpite de n�mero entre 1 e 6");
		System.out.println("O seu palpite foi: " + palpite);
		String [] dados = {"1","2","3","4","5","6"};
		Random r = new Random();
		int indiceDados = r.nextInt(dados.length);
		String dado = dados [indiceDados];
		System.out.println("O n�mero do dado sorteado foi: " + dado);
		if (dado == palpite){
		System.out.println("O n�mero sorteado do dado � igual ao do palpite");
		
		}
		else {
	    System.out.println("O n�mero sorteado do dado � diferente do seu palpite. Tente novamente.");
		
		}
	}
	
	
}
