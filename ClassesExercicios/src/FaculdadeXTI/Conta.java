package FaculdadeXTI;

public class Conta {

	String nome;
    double saldo;
    
    Conta (){}

    Conta (String nome, double saldo){
    	this.nome=nome;
    	this.saldo=saldo;
    }
	
    double totalSaldo (double saldo){
    	return saldo;
    }
}
