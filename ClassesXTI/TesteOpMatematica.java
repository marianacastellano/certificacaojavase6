package br.com.xti.poo.heranca;

public class TesteOpMatematica extends OperacaoMatematica {
	
	public static void calcule(OperacaoMatematica o, int x, int y){
		System.out.println(o.operacao(x, y));
	}

	public static void main (String[] args){
	
		
	OperacaoMatematica a = new Soma();
	OperacaoMatematica b = new Multiplicacao();

	calcule(a,5,5);
	calcule(b,5,5);
	
	
}
}