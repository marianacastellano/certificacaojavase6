package FaculdadeXTI;

import java.util.Scanner;



public class Entrada {


	@SuppressWarnings("resource")
	public static void main (String[] args){
	
	
	Scanner s = new Scanner(System.in);
	System.out.println("Qual � o seu nome?");
	String nome = s.nextLine();
	System.out.println("Seja bem vindo,  " + nome);
}

}


