package br.com.xti.poo;
//construtor = carro
public class Construtor {
	String modelo;
	double velocidadeMax;
	double segundosZeroaCem;
	Motor motor;
	//construtor inicializa o objeto
	public Construtor(){
		
	}
	public Construtor(String modelo, double velocidadeMax, double segundosZeroaCem){
	this(modelo,velocidadeMax,segundosZeroaCem,null);
	}
	public Construtor(String modelo, double velocidadeMax, double segundosZeroaCem,Motor motor){
		this.modelo= modelo;
		this.velocidadeMax=velocidadeMax;
		this.segundosZeroaCem=segundosZeroaCem;
		this.motor = motor;
		}
	
	public static void main(String[] args){
		
		Construtor x = new Construtor();
		x.modelo="ferrari";
		x.segundosZeroaCem=3.2;
		x.velocidadeMax=350;
		Motor v12 = new Motor();
		v12.tipo= "v12";
		v12.potencia = 660;
		x.motor = v12;
		
		//o de cima e igual ao debaixo
		
		Construtor y = new Construtor ("ferrari", 350, 3.2);
	    System.out.println(y.modelo);
	    Motor v8 = new Motor ("v8", 1018);
	    y.motor = v8;
	    
	    //o de cima é igual ao debaixo
	    
	    Construtor z = new Construtor ("ferrari", 350,3.2,new Motor("w16",1400));
	    System.out.println(z.motor.potencia);
	}
	
	
}
