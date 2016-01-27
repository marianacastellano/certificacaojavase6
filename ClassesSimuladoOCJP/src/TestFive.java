public class TestFive {
 private int x;
 public void foo() {
 int current = x;
 x = current + 1;
 }
 public void go() {
 for(int i = 0; i < 5; i++) {
 new Thread() {
 public void run() {
 foo();
 System.out.print(x + ", ");
 }}.start();
 } }}