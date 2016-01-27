package FaculdadeXTI;

public class Salario {
     double valorHora;
     double salarioBruto;
     double salarioLiquido;
     double horasTrabalhadas;
     double porcentagem;
     double descontoInss;
     
     
     void salarioBruto () {
    	 this.salarioBruto = valorHora*horasTrabalhadas;
     }
	 
     void salarioLiquido (){
    	 descontoInss = (salarioBruto*porcentagem)/100;
    	 this.salarioLiquido = salarioBruto - descontoInss;
     }
     
	public static void main (String[] args){
	 Salario funcionario = new Salario ();	
	 funcionario.horasTrabalhadas = 190;
	 funcionario.valorHora = 10;
	 funcionario.salarioBruto();
	 System.out.println ("o salário bruto é: " + funcionario.salarioBruto);
	 funcionario.porcentagem = 8;
	 funcionario.salarioLiquido();
	 System.out.println ("o salário líquido é : " + funcionario.salarioLiquido);
	 
	 
		
	}
}
