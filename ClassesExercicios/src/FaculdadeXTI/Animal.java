package FaculdadeXTI;

public class Animal{
	
	String nome;
	int quantidade;
	
	 Animal (String nome, int quantidade){
		this.nome=nome;
		this.quantidade=quantidade;
	}
	
	void contagem (int numero){ 
		int quantidade =+ numero;
		System.out.println(quantidade);
	}
	
	
}