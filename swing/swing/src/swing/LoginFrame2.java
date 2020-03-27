package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LoginFrame2 extends JFrame{
    
    private Container c;
    private JLabel lb;
    private Font f;
    
    LoginFrame2(){
        
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(500,150,600,500);
        setTitle("HP-BOOK");
        setResizable(false);
        
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        f=new Font("Arial",Font.ITALIC,22);
        
        lb=new JLabel("Welcome to HP-BOOK");
        lb.setBounds(150,50,300,50);
        lb.setFont(f);
        
        c.add(lb);
        
        
        
    }
    
    /*public static void main(String[] args) {
        
        LoginFrame2 fr2=new  LoginFrame2();
        fr2.setVisible(true);
        
        
        
        
    }*/
    
}
