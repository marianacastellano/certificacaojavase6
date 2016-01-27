package FaculdadeXTI;

public class Animais {
	private String nome;
	private int idade;
	private int valor;
	

	 Animais(String nome, int idade, int valor){
	}
	 Animais(){}

	
	public String getNome(){
		return nome;
		
	}
	
	public void setNome (String nome){
		this.nome= nome;
	}
	
	public static void main (String[] args){
		Gato a = new Gato();
		a.setNome("Gato");
		System.out.println(a.getNome());

		
	}
} class Gato extends Animais{

	}

	