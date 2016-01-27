package br.com.xti.poo;

class Conta {
	String cliente;
     double saldo;
     
     
     public Conta(String cliente, double saldo){
    	 
     }
     public Conta(){
    	 
     }
	
	void exibeSaldo (){
		System.out.println(cliente + " seu saldo �:" + saldo);
	}
	
	void saca (double valor){
		if (valor > saldo){
			System.out.println("Est� opera��o n�o pode ser realizada");
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


public class TesteConta {

	public static void main (String[] args) {
	
	Conta conta = new Conta("Mauricio",200);
	conta.exibeSaldo();

    

    
    Conta contaDestino = new Conta ();
    contaDestino.exibeSaldo();
    conta.transfere(contaDestino, 15000);
    
	
	
	conta.exibeSaldo();
	contaDestino.exibeSaldo();


}
}
