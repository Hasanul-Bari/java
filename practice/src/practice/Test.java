package practice;

   
    import java.util.Scanner;
class calculator{
	    int a,b;
	    int get_a(){
	    	Scanner scan = new Scanner(System.in);
	    	System.out.println("Enter first number:");
	    	a=scan.nextInt();
	    	return (a);
	    }	
	    	int get_b(){
	    		  	Scanner scan = new Scanner(System.in);
	    	 	System.out.println("Enter second number:");
	    	b=scan.nextInt();
	    	return (b);
	    }
	    void showoption(){
	    	System.out.println("......Choose......");
	    	System.out.println("1. Add ");
	    	System.out.println("2. Subtract ");
	    	System.out.println("3. Multiply ");
	    	System.out.println("4. Divide ");
	    	System.out.println("5. Exit ");
	    }
}

public class Test{
	  public static void main(String args[]){
	  	  calculator calc = new calculator();
                  Scanner scan = new Scanner(System.in);
	  	  int a=calc.get_a();
	  	  int b=calc.get_b();
	  	  calc.showoption();
	  	  int ans,output;
	  	  ans=scan.nextInt();
	  	  switch (ans)
	  	  {
	  	  	case 1: 
	  	  	      output = a+b;
	  	  	      break;
	  	  	  case 2:
	  	  	        output =a-b;
	  	  	        break;
	  	  	    case 3:
	  	  	          output=a*b;
	  	  	          break;
	  	  	     case 4:
	  	  	          output = a/b;
	  	  	          break;
	  	  	      case 5:
	  	  	               return;
	  	  	        default:
	  	  	                System.out.println("Please enter valid option.");
	  	  	                return;
	  	  }
	  	  System.out.println(output);
	  }
}
    
