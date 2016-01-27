package FaculdadeXTI;

public class TesteConta extends Conta {
	
	public static void total (Conta o, double saldo){
		System.out.println(o.totalSaldo(saldo));
	}
	
	public static void main (String[] args){
	
	Conta b = new ContaPoupanca();
	Conta c = new ContaCorrente();

	total(b,600.01);
	total(c,600.01);
}
}