
public class Carro {
	
private String modelo;
private String cor;
	
public void setModelo(String y){
	this.modelo = y;
	
}
	public static void main (String[] args){
		Carro a = new Carro();
		a.setModelo("aaa");
		
		System.out.println(a.modelo);
		
		
		
	}

}
