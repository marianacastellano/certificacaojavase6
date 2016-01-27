package br.com.xti.poo.heranca;

public class Animal  {

	double peso;
	String comida;
	protected int serial;
	//protege somente das classes externas, ela e visivel pelas subclasses.
	
	public Animal (double peso, String comida){
		this.peso=peso;
		this.comida=comida;
	}
	void dormir(){
		System.out.println("Dormir");
	}
    void fazerBarulho(){
    	System.out.println("Fazer barulho");
    }
}

