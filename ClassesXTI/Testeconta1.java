package br.com.xti.poo.heranca;

public class Testeconta1  {
	
	public static void main (String[] args){

	 	Conta1 c = new Conta1();
	    ContaCorrente cc = new ContaCorrente();
	    ContaPoupanca cp = new ContaPoupanca();
	  
	    c.deposita(1000); 
	    cc.deposita(1000); 
	    cp.deposita(1000);
	  
	    c.atualizar(0.01);
	    cc.atualizar(0.01);
	    cp.atualizar(0.01);

	    System.out.println(c.getSaldo());
	    System.out.println(cc.getSaldo());
	    System.out.println(cp.getSaldo());

	
	
	}
}