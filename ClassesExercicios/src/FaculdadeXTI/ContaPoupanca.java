package FaculdadeXTI;

public class ContaPoupanca extends Conta {

	String nome;
	double saldo;

    ContaPoupanca (){
    
    }
	
    public double totalSaldo (double saldo){
    	saldo = saldo * 0.05 + saldo;
    	System.out.println("Seu saldo da Conta Poupan�a � de R$" );
    	return saldo;
    	
    }
}
