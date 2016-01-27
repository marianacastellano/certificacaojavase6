class Alpha {
public void foo() { System.out.print("Afoo "); }
}
public class Beta2 extends Alpha {
public void foo() { System.out.print("Bfoo "); }
public static void main(String[] args) {
Alpha a = new Beta2();
Beta2 b = (Beta2)a;
a.foo();
b.foo();
}
}