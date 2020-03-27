package hw;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Test2 extends JFrame {
    
    private Container c;
    private JButton btn1,btn2,btn3,btn4;
    private JLabel lb;
    private JTextField tf;
    
    private Font f;
    
    Test2(){
        
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(400, 100, 600, 500);
        this.setTitle("Swing Demo");
        this.setResizable(false);
        
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.MAGENTA);
        
        f=new Font("Arial",Font.BOLD+Font.ITALIC,20);
        
        
        /*tf=new JTextField();
        tf.setBounds(50,50,200,50);
        c.add(tf);*/
        
        btn1=new JButton("Remember me");
        btn1.setBounds(50,200,200,50);
        
        c.add(btn1);
        
        
        
        
        
        lb=new JLabel();
        lb.setBounds(50,300,500,50);
        lb.setOpaque(true);
        lb.setBackground(Color.cyan);
        lb.setFont(f);
        c.add(lb);
        
        
        Handler handler=new Handler();
        btn1.addActionListener(handler);
   
      
    }
    
    class Handler implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==btn1)
            {
                String s=lb.getText();
                lb.setText(s);
            }
            
        }
    }
    
    
    
    
    
    
    
    public static void main(String[] args) {
        
        Test2 fr=new Test2();
        
        
    }
}
