
public class Spock {
  
	public static void main(String[] args){
		int mask = 0;
		int count = 0;
		
		if ( ((5<7) || (++count<10)) | mask++ < 10) mask = mask + 1; //5<7 � verdadeiro, ent�o n�o roda ++count 
		if ((6>8) ^ false) mask = mask + 10; // 6>8 se forem iguais retorna FALSO
		if ( !(mask>1) && ++count > 1) mask = mask+100; // o inverso do mask>1 � falso, ent�o n�o roda ++count
		System.out.println(mask + "," + count);
		
	}
}
