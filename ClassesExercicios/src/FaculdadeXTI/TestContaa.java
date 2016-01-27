package FaculdadeXTI;

public class TestContaa {

		public static void saldoAtual (Contaa o, double taxa){
			System.out.println(o.atualiza(taxa));
		}
	
	public static void main (String[] args){
		
		
		Contaa a = new ContaCorrentee();
		Contaa b = new ContaPoupancaa();
		a.saldo=100;
		b.saldo=200;
		a.atualiza(0.6);
		b.atualiza(0.6);
	}
}
