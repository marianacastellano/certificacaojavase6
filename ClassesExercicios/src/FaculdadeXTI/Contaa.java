package FaculdadeXTI;

public class Contaa {

	protected double saldo;

	public double getSaldo (){
		return saldo ;
	}
	public double deposita(double valor){
		this.saldo=saldo+valor;
       System.out.println(valor);
       return saldo;
	}
	   
	public void sacar(double valorb){
		this.saldo=saldo-valorb;
		System.out.println(valorb);

	}
	
	public double atualiza (double taxa){
		this.saldo= saldo*taxa;
		System.out.println(saldo);
		return saldo;
	}
	
	
	

	}

