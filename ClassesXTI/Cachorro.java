package br.com.xti.poo.heranca;

public class Cachorro extends Animal {
	//chama o construtor da super classe
	public Cachorro(){
		super(40,"carne");
	}
	void fazerBarulho(){
		System.out.println("auau");
	}

}
