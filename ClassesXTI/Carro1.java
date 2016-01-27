package br.com.xti.poo.heranca;

public class Carro1  {

	String nome;
	int potencia;
	Motor motor;
	
	public Carro1(String nome, int potencia){
		this.nome= nome;
		this.potencia=potencia;
	}
	public Carro1(String nome, int potencia, Motor motor){
		this.nome=nome;
		this.potencia=potencia;
		this.motor=motor;
	}

	
	public static void main (String[] args){
		
	Carro1 ferrari = new Carro1("Ferrari", 200);
	ferrari.motor = new Motor("v12",100);
	ferrari.motor.roncar(100);
	System.out.println(ferrari.motor.potencia);
	
}
}