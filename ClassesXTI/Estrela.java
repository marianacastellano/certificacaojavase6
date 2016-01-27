package br.com.xti.poo.heranca;



	public class Estrela {
		public String nome;
		public Estrela (){
		 }
		public Estrela(String nome){
		this.nome = nome;
		}
		public void trocarNome(Estrela estrela){
		this.nome = "Dalva";
		estrela = null;
		}
		public static void main(String[] args) {
		Estrela estrela = new Estrela();
		System.out.print(estrela.nome + " | ");
}
}