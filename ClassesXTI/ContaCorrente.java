package br.com.xti.poo.heranca;

public class ContaCorrente extends Conta1 {
	
	public void atualizar(double taxa){
		this.saldo+= this.saldo*taxa*2;		
	}
}
