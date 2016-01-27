package br.com.xti.poo;

public class Desafio {

	
	int raiz(int numero) {
		int raiz = 0 ,impar = 1;
		while (numero >= impar){
			numero -= impar;
			impar += 2;
			++raiz;
		}
		 return raiz;
	}
}
