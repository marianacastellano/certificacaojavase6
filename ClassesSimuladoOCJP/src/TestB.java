 class TestA1 {
 public void start() { System.out.println("TestA"); }
 }
 public class TestB extends TestA1 {
 public void start() { System.out.println("TestB"); }
 public static void main(String[] args) {
 ((TestA1)new TestB()).start();
 }}