package FaculdadeXTI;

public class ContaPoupancaa extends Contaa {
	
	public double atualiza (double taxa){
		this.saldo=saldo*(3*taxa);
		System.out.println(saldo);
		return saldo;
	}

	public double deposita(double valor){
		this.saldo=saldo+valor-0.10;
       System.out.println(valor);
       return saldo;
	}
}
