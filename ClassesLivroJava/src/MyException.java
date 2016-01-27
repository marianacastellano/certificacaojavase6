
public class MyException extends Exception{
	public static void main (String[] args) throws MyException{
		
		someMethod();
		
		try{
			
		}finally{
			
		}
	}
			
		static void someMethod() throws MyException {
			
				doStuff();
			
		}
			
		static void doStuff() throws MyException{
			throw new MyException();
			
		}
		}
		
