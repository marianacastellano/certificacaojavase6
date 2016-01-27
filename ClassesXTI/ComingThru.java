package br.com.xti.poo.heranca;

public class ComingThru {
  static String s ="-";
  
  public static void main (String [] args){
	A[] aa = new A[2];
	B[] ba = new B[2];
	silfter (aa);
	silfter (ba);
	silfter (7);
	System.out.println(s);
	 
	  
  }

  static void silfter (A[]...a2){s+=1;}
  static void silfter (B[]...b1){s+=2;}
  static void silfter (B[]b1) {s+=3;}
  static void silfter (Object o) {s+=4;}


}


