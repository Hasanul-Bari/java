package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LoginFrame extends JFrame {
    
    private Container c;
    private JLabel ul,pl;
    private JTextField uf;
    private JPasswordField pf;
    private JButton login,clear;
    
    private Font f;
    
    
    
    LoginFrame(){
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        
        f=new Font("Arial",Font.BOLD,20);
        
        ul=new JLabel("Username : ");
        ul.setBounds(50,50,200,50);
        ul.setFont(f);
        c.add(ul);
        
        pl=new JLabel("Password : ");
        pl.setBounds(50,120,200,50);
        pl.setFont(f);
        c.add(pl);
        
        
        uf=new JTextField();
        uf.setBounds(200,50,250,50);
        uf.setFont(f);
        c.add(uf);
        
        pf=new JPasswordField();
        pf.setBounds(200,120,250,50);
        c.add(pf);
        
        
        login=new JButton("Log in");
        login.setBounds(200,200,100,50);
        login.setFont(f);
        c.add(login);
        
        clear=new JButton("Clear");
        clear.setBounds(350,200,100,50);
        clear.setFont(f);
        c.add(clear);
        
        login.addActionListener(new ActionListener(){
            
           @Override
           public void actionPerformed(ActionEvent e)
           {
               String un=uf.getText();
               String pass=pf.getText();
               
               if(un.equals("hasan") && pass.equals("1234") )
               {
                   JOptionPane.showMessageDialog(null,"successfully logged in");
                   //dispose();  // 1st login frame close krbe
                   LoginFrame2 fr=new LoginFrame2();
                   fr.setVisible(true);
                   
               }
               else
                   JOptionPane.showMessageDialog(null,"Invalid username or password");
           }
            
        });
        
        
        clear.addActionListener(new ActionListener(){
            
           @Override
           public void actionPerformed(ActionEvent e)
           {
               uf.setText("");
               pf.setText("");
           }
            
        });
        
        
    }
    
    public static void main(String[] args) {
        
        LoginFrame fr=new LoginFrame();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(400,150,600,500);
        fr.setTitle("Login Frame");
        fr.setResizable(false);
        
    }
    
    
}
