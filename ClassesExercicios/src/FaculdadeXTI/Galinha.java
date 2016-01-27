package FaculdadeXTI;

public class Galinha {

	public int ovos;
	public static int ovosDaGranja;

	public Galinha botar() {
		this.ovos = ovos + 2;
		Galinha.ovosDaGranja = ovosDaGranja + 2;
		return this;
	}

	public static double mediaDeOvos(int galinhas) {
		return Galinha.ovosDaGranja / galinhas;
	}

	public static void main(String[] args) {
		Galinha g1 = new Galinha();
		g1.botar().botar().botar();
		Galinha g2 = new Galinha();
		g2.botar().botar().botar();

		System.out.println(Galinha.mediaDeOvos(2));
		System.out.println(g1.ovos);
		
		System.out.println();
		
		
	}

}