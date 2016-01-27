package br.com.xti.poo.heranca;

public class ContaPoupanca extends Conta1 {

	public void atualizar(double taxa){
		this.saldo+= this.saldo*taxa*3;		
	}

}
