import java.io.IOException;


public class MyException1 {
	
	 void doStuff() throws IOException{
		 doMore();
	 }

	 void doMore() throws IOException {
		 throw new IOException();
	 }
	 
 }

