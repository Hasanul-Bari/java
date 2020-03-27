package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

public class ToggleButtonDemo extends JFrame implements ActionListener {
    
    private Container c;
    private JToggleButton tbtn;
    private JLabel lb;
    
    ToggleButtonDemo() {

        c = this.getContentPane();

        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        tbtn=new JToggleButton("OFF");
        tbtn.setBounds(50,50,200,200);
        c.add(tbtn);
        
        lb=new JLabel("Hello HP");
        lb.setBounds(50,300,100,50);
        lb.setVisible(false);
        c.add(lb);
        
        tbtn.addActionListener(this);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(tbtn.isSelected()){
            tbtn.setText("ON");
            lb.setVisible(true);
        }
        else
        {
            tbtn.setText("OFF");
            lb.setVisible(false);
        }
    }
    
    public static void main(String[] args) {

        ToggleButtonDemo fr = new ToggleButtonDemo();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fr.setBounds(400, 100, 700, 500);
        fr.setTitle("ToggleButtonDemo");
        fr.setResizable(false);
    }

    
}
