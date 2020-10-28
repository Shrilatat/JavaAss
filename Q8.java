import java.util.*;

public class Q8 {
	
	public static void main(String[] args) {
		int num = 12346789;
		int[] anArray = new int[100000];	    
		   

	    
	    
	  
	    int size = 0;
	    while(num != 0)
	    { int temp;
	    	temp = num % 10;
	    	anArray[size] = temp;
	    	size = size + 1;
	        num = num/10;
	        
	    }
	    
	    for(int i = 0;i < size;i++)
	    {
	    	System.out.print(anArray[i]+" ");
	    }

	}

	}
		


	