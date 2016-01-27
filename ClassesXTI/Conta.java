package br.com.xti.poo;


public class Conta {
	String cliente;
     double saldo;
     
     
     public Conta(String cliente, double saldo){
    	 
     }
     public Conta(){
    	 
     }
	
	void exibeSaldo (){
		System.out.println(cliente + " seu saldo é:" + saldo);
	}
	
	void saca (double valor){
		if (valor > saldo){
			System.out.println("Está operação não pode ser realizada");
		} else{
			this.saldo -= valor;
			System.out.println("Saldo atual:" + saldo);
			
		}
	}
	
	void deposita (double valor){
		this.saldo += valor;
		System.out.println("Deposito efetuado com sucesso " +  saldo);
	}
	
	void transfere (Conta destino, double valor){
		this.saca(valor);
		destino.deposita(valor);
		
	}
}
