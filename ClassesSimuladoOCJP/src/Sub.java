class Super {
public int a = 5;
protected Super(int a) { this.a = a; }
} 
 public class Sub extends Super {
 public Sub(int a) { super(a); }
 public Sub() { super(a); }
 }