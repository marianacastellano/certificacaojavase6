package br.com.xti.poo.heranca;

public class Zookeeper{
	
	  public static void main (String[] args){
		  new Zookeeper().go();}
		  void go(){
			  Mammal m = new Zebra();
			  System.out.println(m.name());
			  System.out.println(m.makeNoise());
		  
	  
		  }
}
