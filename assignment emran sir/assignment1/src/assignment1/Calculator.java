package assignment1;

import java.util.Scanner;

class Test{
    
    private int a,b;
    Test(int x,int y){
        a=x;
        b=y;
    }
    
    public void add(){
        System.out.printf("%d + %d =%d\n",a,b,a+b);
    }
    public void subtract(){
        System.out.printf("%d - %d =%d\n",a,b,a-b);
    }
    public void multiply(){
        System.out.printf("%d * %d =%d\n",a,b,a*b);
    }
    public void divide(){
        System.out.printf("%d / %d =%f\n",a,b,(double)a/b);
    }
    public void modulo(){
        System.out.printf("%d mod %d = %d\n",a,b,a%b);
    }
    
}

public class Calculator {

	

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
                int x,y,t;
                System.out.println("Enter two integers : ");
                x=input.nextInt();
		y=input.nextInt();
		
		
		
                Test obj=new Test(x,y);
             
			
		do
		{
                    System.out.println("\n\nEnter your choice....");
                    System.out.println("1.addition");
                    System.out.println("2.subtraction");
                    System.out.println("3.multiplication");
                    System.out.println("4.division");
                    System.out.println("5.remainder");
                    System.out.println("0.Exit");
                   
                    
                    t=input.nextInt();
                    if(t==1)
			obj.add();
                    else if(t==2)
			obj.subtract();
                    else if(t==3)
			obj.multiply();
                    else if(t==4)
			obj.divide();
                    else if(t==5)
                        obj.modulo();
			
			
		}while(t!=0);
		

	}

}
