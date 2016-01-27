package FaculdadeXTI;

public class Zoologico {
	
	String nome;
	int quantidadeDeAnimais;
	Animal animal;
	
	Zoologico(){}
	
	Zoologico (String nome, int quantidadeDeAnimais){
		this.nome=nome;
		this.quantidadeDeAnimais=quantidadeDeAnimais;
	}
	
	public static void main (String[]args){
		Zoologico a = new Zoologico ();
		a.animal = new Animal ("gato", 100);
		System.out.println (a.animal.nome);
		
	}
}