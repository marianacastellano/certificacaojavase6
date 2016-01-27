package br.com.xti.poo.heranca;

public class AnimalTeste {
	//esse metodo é devido o polimorfismo
	public static void barulho(Animal animal) {
		animal.fazerBarulho();
	}

	public static void main(String[] args) {
		Animal toto = new Cachorro();
		toto.comida = "carne";
		toto.dormir();
	

		Animal carijo = new Galinha();
		carijo.comida = "milho";
		carijo.dormir();
	

		toto.equals(carijo);// se os valores são iguais
		toto.hashCode();// adicionar um codigo unico, em arraylist
		toto.getClass();// retorna o tipo da classe desse objeto(cachorro nesse
						// caso)
		toto.toString();// retorna a respresentação em texto desse objeto

		barulho(toto);
		barulho(carijo);

	}
}
