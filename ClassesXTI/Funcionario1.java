package br.com.xti.poo;

public class Funcionario1 {
	
	private String nome;
	private boolean ativo;
	public String getNome (){
		return nome;
	}
	public void setNome (String n){
		this.nome=n;
	}
    public boolean isAtivo (){
    	return ativo;
    }
    public void setAtivo (boolean a){
    	this.ativo= a;
    }
}
