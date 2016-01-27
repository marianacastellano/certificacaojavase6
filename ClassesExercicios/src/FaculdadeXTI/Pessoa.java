package FaculdadeXTI;

public class Pessoa {
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

}
class Funcionario extends Pessoa{
	public static void main(String[] args) {
		Pessoa p1 = new Funcionario();
		
	}
}
