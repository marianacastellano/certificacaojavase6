package FaculdadeXTI;

class data {
	int dia;
	int mes;
	int ano;
	
	void prencheData (int dia, int mes, int ano){
		this.dia = dia;
        this.mes = mes;
        this.ano = ano;
	}
}

 class funcionario {
	
	public String nome;
	public double salario;
	private int rg;
	private data dataEntrada ;
	 

	
 
	public double getcalculaGanhoAnual (){
	 return this.salario = salario * 12; 
	 }	
	 
	private void mostra (){
		 System.out.println("Nome: " + this.nome);
		 System.out.println("Salario: " + this.salario);
		 System.out.println ("Ganho Anual : " + this.getcalculaGanhoAnual());
	 }
 
	public static void main(String[] args){
		funcionario mariana = new funcionario();
		mariana.nome = "mariana";
		mariana.salario = 900;
		mariana.rg = 2825520;
		mariana.mostra();
		
		mariana.dataEntrada = new data ();
		mariana.dataEntrada.prencheData(25,2,1991);
		
	
		
		
		funcionario matheus = new funcionario();
		matheus.nome = "matheus";
		matheus.salario= 1000;
		matheus.rg = 2353434;
		matheus.mostra();
		 
	   if (mariana == matheus){
		   System.out.println("São iguais");
	   } else {
			   System.out.println("São diferentes");
		   }
	   }
	
	 
	}

