
@SuppressWarnings("serial")
public class Propagate extends Exception {


	public static void main(String[] args){
		
		String str = null;
		try {
		str = reverse(args);
		}
		catch (ArrayIndexOutOfBoundsException ex) {
		System.out.println("Input a string you bozo!");
		}
		finally {
		if (str != null) {
		System.out.println ("Reversed string is: " + str);
		}
		}
		}
		  
		public static String reverse(String[] cmd) throws ArrayIndexOutOfBoundsException {
		String s = "";
		String reverseStr = "";
		try {
		s = cmd[0];
		if (s.length() == 0) {
		throw new IndexOutOfBoundsException();
		}
		for (int i= s.length() - 1; i >= 0; --i) {
		reverseStr += s.charAt(i);
		}
		}
		catch (ArrayIndexOutOfBoundsException e) {
		throw e;
		}
		return reverseStr;
		}
}
