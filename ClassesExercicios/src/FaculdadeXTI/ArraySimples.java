package FaculdadeXTI;
import java.util.Random;


public class ArraySimples {
	
	public static void main (String [] args){
		String[] faces = {"1","2","3","4"};
		String[] nape = {"espada", "reis"};
		
		Random r = new Random();
		int indiceFaces = r.nextInt(faces.length);
		String face = faces [indiceFaces];
		int indiceNape = r.nextInt(nape.length);
		String napes = nape [indiceNape];
		String carta = face + " " + napes;
		System.out.println(carta);
	}

}
