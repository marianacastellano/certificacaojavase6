package br.com.xti.poo;

public class GalinhaTeste {
	public static void main (String[] args){
		Galinha g = new Galinha();
		g.botar().botar().botar();
		System.out.println(g.ovos);
		
		Galinha g2 = new Galinha();
		g2.botar().botar();
		System.out.println(g2.ovos);
		System.out.println(Galinha.ovosDaGranja);
		System.out.println(Galinha.mediaDeOvos(2));
	}

}
