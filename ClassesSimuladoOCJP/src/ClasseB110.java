 class A {
 void process() throws Exception { throw new Exception(); }
 }
 public class ClasseB110 extends A {
 void process() { System.out.println("B"); }
 
 public static void main(String[] args) {
 new ClasseB110().process();
}}
 
