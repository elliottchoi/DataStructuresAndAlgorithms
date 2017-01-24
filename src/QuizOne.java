import java.math.*;
public class QuizOne {

	public static void main(String[] args) {

	}
	
	//Find sum of n-even fib sequence
	public int evenFib(long number){
		// Fibonacci
	    int f = 2;
	    int g = 1;
	    int sum=1;
	    
	    if(number==1)
	    {
	    	return 0;
	    }
	    else if (number==2)
	    {
	    	return 1;
	    }

	    else{
	    for (int i = 3; i <=number ; i++) {
	    	
	    	if(i%2==0)
	    	{
	    		sum+=f;
	    	}
	     
	        f = f + g;
	        g = f - g;
	    } 
	   return sum;
	    }
	}

	//O(1) implementation of square of sums - sum of squares
	public long squareSums(long n)
	{
		return (long) ((long) (Math.pow((n/3)*(n+1)*(n+0.5), 2.0))-Math.pow(((n)*(n+1)/2),2.0));
	}
}

