package FaculdadeXTI;

public class GalinhaTeste {

	public static void main (String[] args){
		
		Galinha g1 = new Galinha ();
		g1.botar().botar().botar();
		
		Galinha g2 = new Galinha ();
		g2.botar().botar();
		
		System.out.println (g1.ovos);
		
		
	}
}
