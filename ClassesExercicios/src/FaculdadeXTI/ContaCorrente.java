package FaculdadeXTI;

public class ContaCorrente extends Conta {
	
	String nome;
	double saldo;

 
    public ContaCorrente() {
	
	}

	public double totalSaldo(double saldo){
    	saldo = saldo - 16.68;
    	System.out.println("Seu saldo da Conta Corrente é de R$");
        	return saldo;
        
    	
    }
}
