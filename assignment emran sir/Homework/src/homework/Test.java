package homework;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test extends JFrame {
    
    private Container c;
    private JButton btn1,btn2,btn3,btn4;
    private JLabel lb;
    
    private Font f;
    
    Test(){
        
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(400, 100, 600, 500);
        this.setTitle("Swing Demo");
        this.setResizable(false);
        
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.MAGENTA);
        
        f=new Font("Arial",Font.BOLD+Font.ITALIC,20);
        
        btn1=new JButton("A");
        btn1.setBounds(50,50,100,50);
        btn1.setFont(f);
        c.add(btn1);
        
        
        btn2=new JButton("B");
        btn2.setBounds(200,50,100,50);
        btn2.setFont(f);
        c.add(btn2);
        
        btn3=new JButton("Hide");
        btn3.setBounds(50,300,100,50);
        btn3.setFont(f);
        c.add(btn3);
        
        btn4=new JButton("Close");
        btn4.setBounds(200,300,100,50);
        btn4.setFont(f);
        c.add(btn4);
        
        lb=new JLabel();
        lb.setBounds(50,150,500,50);
        lb.setOpaque(true);
        lb.setBackground(Color.cyan);
        lb.setFont(f);
        c.add(lb);
        
        
        Handler handler=new Handler();
        btn1.addActionListener(handler);
        btn2.addActionListener(handler);
        btn3.addActionListener(handler);
        btn4.addActionListener(handler);
      
    }
    
    class Handler implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==btn1)
            {
                String s=lb.getText();
                s=s+'A';
                lb.setText(s);
            }
            else if(e.getSource()==btn2)
            {
                String s=lb.getText();
                s=s+'B';
                lb.setText(s);
            }
            else if(e.getSource()==btn3)
            {
                setVisible(false);
            }
            else
            {
                dispose();
             
            }
        }
    }
    
    
    
    
    
    
    
    public static void main(String[] args) {
        
        Test fr=new Test();
        
        
    }
}
