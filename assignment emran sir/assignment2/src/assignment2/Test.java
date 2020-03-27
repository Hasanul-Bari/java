package assignment2;

import javax.swing.JOptionPane;

class Calculator{
    
    private int a,b;
    
           
    Calculator(int x,int y){
        a=x;
        b=y;
    }
    
    public void add(){
        JOptionPane.showMessageDialog(null, a+" + "+b+" = "+(a+b));
    }
    public void subtract(){
        JOptionPane.showMessageDialog(null, a+" - "+b+" = "+(a-b));
    }
    public void multiply(){
        JOptionPane.showMessageDialog(null, a+" * "+b+" = "+(a*b));
        
    }
    public void divide(){
        JOptionPane.showMessageDialog(null, a+" / "+b+" = "+(double)a/b);
        
    }
    public void modulo(){
        JOptionPane.showMessageDialog(null, a+" mod "+b+" = "+(a%b));
    }
    
}

public class Test {

	

	public static void main(String[] args)
	{
                int x,y,t;
                String s1=JOptionPane.showInputDialog("Enter first integer");
                String s2=JOptionPane.showInputDialog("Enter second integer");
               
                x=Integer.parseInt(s1);
                y=Integer.parseInt(s2);
		
		
		
                Calculator obj=new Calculator(x,y);
             
			
		do
		{
                    String s3=JOptionPane.showInputDialog("1.addition\n2.subtraction\n3.multiplication\n4.division\n5.remainder\n0.Exit\nEnter your choice");
                    
                    t=Integer.parseInt(s3);
                    
                
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
                    else if(t>=6)
                        JOptionPane.showMessageDialog(null, "Error input,Try again");
                        
			
			
		}while(t!=0);
                
                JOptionPane.showMessageDialog(null, "Thank you\nEnd Of Program");
		

	}

}
