
interface TestA { String toString(); }
public class Test226 {
public static void main(String[] args) {
 System.out.println(new TestA(){
 public String toString() { return "test"; }
 });}}

