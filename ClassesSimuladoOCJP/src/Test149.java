
public class Test149 {
 public enum Dogs {collie, harrier, shepherd};
 public static void main(String [] args) {
 Dogs myDog = Dogs.shepherd;
 switch (myDog) {
 case collie:
 System.out.print("collie ");
 case default: //**não existe case default, so default
 System.out.print("retriever ");
 case harrier:
 System.out.print("harrier ");
 }
}
 }
