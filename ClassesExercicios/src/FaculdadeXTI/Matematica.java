package FaculdadeXTI;
public class Matematica {
	int maior, numero, raiz;
	double soma;
	String nome;

	int maior(int um, int dois) {
		if (um > dois) {
			return um;
		} else {
			return dois;
		}
	}

	double soma(double um, double dois) {
		double s = um + dois;
		return s;
	}
	
	
	
	

	int raiz(int numero) {
		 int impar;
		 raiz = 0;
		 impar =1;
		 while (numero >= impar){
			 numero -= impar;
			 impar +=2;
			raiz++;
			 
			 
		 }
		 
		 
		 return raiz;
		
		

	}

	public static void main (String[] args){
		Matematica m = new Matematica ();
		int maior = m.maior(10, 20);
		System.out.println(maior);
		double soma = m.soma(10, 20);
		System.out.println(soma);
		int raiz = m.raiz(27);
		System.out.println(raiz);
	
		
	}
}
