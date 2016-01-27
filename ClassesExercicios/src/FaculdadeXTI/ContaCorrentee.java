package FaculdadeXTI;

public class ContaCorrentee extends Contaa {
	
	public double atualiza (double taxa){
		this.saldo=saldo*(2*taxa);
		System.out.println(saldo);
		return taxa;
	}
	
}
