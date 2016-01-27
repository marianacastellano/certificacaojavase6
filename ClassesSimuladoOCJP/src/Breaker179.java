 public class Breaker179 {
 static String o = "";
 public static void main(String[] args) {
 z:
 o = o + 2; //*nao pode estar aqui essa linha
 for(int x = 3; x < 8; x++) {
 if(x==4) break;
 if(x==6) break z;
 o = o + x;
 }
 System.out.println(o);
 } }