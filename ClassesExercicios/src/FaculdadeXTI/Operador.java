package FaculdadeXTI;

import javax.swing.JOptionPane;

public class Operador {
	
	public static void main (String[] args){
		
		String peso = JOptionPane.showInputDialog("Qual � o seu peso?");
		String altura = JOptionPane.showInputDialog("Qual � a sua altura");
		
		double pesoKg = Double.parseDouble (peso);
		float alturaM = Float.parseFloat (altura);
		double imc = pesoKg/(alturaM * alturaM);
		
	    String mensagem = (imc >=20) && (imc <=25) ? "Voc� est� no peso ideal" : "Voc� n�o est� no peso ideal";
	    mensagem = ("O seu imc � " + imc) + "\n" + mensagem;
		
	    JOptionPane.showMessageDialog(null,mensagem);

		
		
		
		
	}
}
