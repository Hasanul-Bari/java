package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionListener_another_Demo extends JFrame implements ActionListener {
    
    private Container c;
    private JButton btn1,btn2,btn3;
    
    
    
    ActionListener_another_Demo(){
        
        c = this.getContentPane();
        c.setLayout(null);
        
        btn1=new JButton("Red");
        btn1.setBounds(50,50,100,50);
        c.add(btn1);
        
        btn2=new JButton("Green");
        btn2.setBounds(50,125,100,50);
        c.add(btn2);
        
        btn3=new JButton("Blue");
        btn3.setBounds(50,200,100,50);
        c.add(btn3);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==btn1)
        {
            c.setBackground(Color.RED);
        }
        else if(e.getSource()==btn2)
        {
            c.setBackground(Color.GREEN);
        }
        else if(e.getSource()==btn3)
        {
            c.setBackground(Color.BLUE);
        }
    }
    
    public static void main(String[] args) {
        
        ActionListener_another_Demo fr=new ActionListener_another_Demo();
         fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(400, 200, 600, 500);
        fr.setTitle("Combo Box");
        fr.setResizable(false);
    }

    
}
