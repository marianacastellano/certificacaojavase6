package FaculdadeXTI;

public class BalancoTrimestral {

public static void main (String[] args){
	
	int janeiro = 1500;
	int fevereiro = 2300;
	int marco = 1700;	
	 	int total = (janeiro + fevereiro + marco);
		int media = (total/3);
	System.out.println("O total do trimestre é " + total);
	System.out.println("A media mensal é de: R$" + media);
}
}

