import java.util.InputMismatchException;
import java.util.Scanner;


public class TesteExcecao {
	
	public static void main (String[] args){
		
		Scanner x = new Scanner(System.in);
		boolean continua = true;
		
		do{	
		try{
		System.out.println("Digite o Número");
		int a = x.nextInt();
		System.out.println("Digite o Divisor");
		int b = x.nextInt();
		
		System.out.println(a/b);
		continua = false;
		}
		catch (InputMismatchException e){
			System.err.println("Digite um número inteiro");
			
		}
		catch(ArithmeticException e1){
			System.err.println("Digite um divisor diferente de 0");
		} 
		finally{
			System.out.println("Sempre serei executado");
		}

		}while(continua);
		}}
