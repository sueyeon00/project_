package project_;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		System.out.println("//Calculator two integer//");
		
		while(true) 
		{
		
		
		    System.out.println();
			System.out.println(" Input two integer : ");
		    Scanner input = new Scanner(System.in);
		    int First = input.nextInt();
		    int Second = input.nextInt();
	        int Oper = 1;

			System.out.println("1 = +");
		    System.out.println("2 = -");
		    System.out.println("3 = *");
		    System.out.println("4 = / ... %°ª");
		    System.out.println("5 = Exit");
		    System.out.println("Select one number 1-5 : ");
		    Oper = input.nextInt();
		    
		    int result  = 0;
		    int result2  = 0;
		    
	    	switch(Oper) 
	        {
	        
	        case 1:
	           	 result = First + Second;
		         System.out.println(First + "+" + Second + "=" + result);
		         break;
		    
    	    case 2:
	          	result = First - Second;
	        	System.out.println(First + "-" + Second + "=" + result);
	    	    break;
	
	        case 3:
    	        result = First * Second;
		        System.out.println(First + "*" + Second + "=" + result);
	            break;
		   
    	    case 4:
	         	result = First / Second;
	         	result2 = First % Second;
		        System.out.println(First + "/" + Second + "=" + result + "..." + result2);
		        break;  
		    }
	        if(Oper == 5) {
	        	System.out.println("The end==");
	        	break;
	        }
	        	
	        }
		 

		
		
	}

}
