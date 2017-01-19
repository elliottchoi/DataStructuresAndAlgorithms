import java.util.*; 

public class Lecture4 {

	public static void main(String[] args) {

		//There are a variety of errors:
		//Syntax error: code does not compile
		
		//Class path Errors: ClassNotFoundException
		//Class is not provided at runtime
		
		//Runtime errors (failure at runtime while program operates)
		//NullPointerException
		
		//Logic Error: Code executes but not as expected
		
		
		//Throw Exceptions
		final Scanner scanner = new Scanner(System.in);
		
		//Parses an integer from user string input 
		System.out.print("\nInput a value: ");
		String str = scanner.next();
		
		//try block allows for exception handler creation
		//try{
		//		code
		//	 }
		//catch and exception throw
		
		try {
		final int value = Integer.parseInt(str);
		System.out.printf("\"%s\" = %d\n", str, value);
		} 
		
		//Built in exception, if parseInt fails we throw this exception (ie if try fails)
		catch (NumberFormatException nfe) {
		System.out.printf("Could not get int from: \"%s\"\n", str);
		nfe.printStackTrace(System.err);
		}
		
	//Type Hierarchy
	
	//Throwable: parent of all exceptions and defines something in a throw-statement
		
	//Errors are thrown by Java Virtual Machine
		
	//Exception: Defines "Checked" Exceptions<-- things we have the program check for
	//ie a try statement block 
		
	//Runtime Exception defines "Unchecked" exceptions <-- things not in try, and program 
	//is like "????"
		
	//Throwing Exceptions example:
		//When an error is detected use the keyword "throw"
		int i=0;
		if (i<0){
			throw new IllegalArgumentException ("i<0");
		}
		//This exception is just an instance of Illegal argument Exception, must like an 
		//object
		
		//Catching Exceptions
		try {
			throw new IllegalArgumentException();
			} 
		
		catch (IllegalArgumentException iae) {
			iae.printStackTrace();
			}
		
		//You can implement multiple catch exceptions
		// will be in an if, elseif format
		
		
		
		

	}

}
