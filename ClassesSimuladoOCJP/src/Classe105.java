
public class Classe105 {
	public static void main(String[] args) {
	try {
	args = null;
	args[0] = "test";
	System.out.println(args[0]);
	} catch (Exception ex) {
	System.out.println("Exception");//*s� trocar
	} catch (NullPointerException npe) {
	System.out.println("NullPointerException");
	}
	}
	
}
