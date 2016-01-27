static void Test2() throws Error {
 if (true) throw new AssertionError();
 System.out.print("test ");
 }
 public static void main(String[] args) {
 try { Test2(); }
 catch (Exception ex) { System.out.print("exception "); }
 System.out.print("end ");
 }
