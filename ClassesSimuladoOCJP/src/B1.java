
 class A {
 void process() throws Exception { throw new Exception(); }
 }
 public class B1 extends A {
 void process() { System.out.println("B"); }
 
 public static void main(String[] args) {
 new B1().process();}
 }