package br.com.xti.poo.heranca;

public class Conta1 {
	protected double saldo;
	static double taxa;
	
	
	public double getSaldo(){
	return this.saldo;
	}
	public void deposita(double valor){
	this.saldo+=valor;
	}
	public void saca(double valor){
	this.saldo-=valor;
	}
	public void atualizar(double taxa){
	this.saldo+= this.saldo*taxa;	
	}
	
	
	}


