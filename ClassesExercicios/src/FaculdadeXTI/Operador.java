package FaculdadeXTI;

import javax.swing.JOptionPane;

public class Operador {
	
	public static void main (String[] args){
		
		String peso = JOptionPane.showInputDialog("Qual é o seu peso?");
		String altura = JOptionPane.showInputDialog("Qual é a sua altura");
		
		double pesoKg = Double.parseDouble (peso);
		float alturaM = Float.parseFloat (altura);
		double imc = pesoKg/(alturaM * alturaM);
		
	    String mensagem = (imc >=20) && (imc <=25) ? "Você está no peso ideal" : "Você não está no peso ideal";
	    mensagem = ("O seu imc é " + imc) + "\n" + mensagem;
		
	    JOptionPane.showMessageDialog(null,mensagem);

		
		
		
		
	}
}
