package br.com.xti.poo.heranca;

public class TesteCarro {
	
	public static void aumentar (Carro carro){
	 carro.aumento();
	}

	public static void main (String[] args){
		Carro x = new Fusca();
		Carro y = new Gol();

		aumentar(x);
		aumentar(y);
		
		
		
	}
}
