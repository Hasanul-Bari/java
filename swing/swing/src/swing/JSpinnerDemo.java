package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSpinnerDemo extends JFrame  implements ChangeListener{
    
    private Container c;
    private JSpinner sp;
    private JLabel lb;
    
    JSpinnerDemo() {

        c = this.getContentPane();

        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        SpinnerNumberModel value=new SpinnerNumberModel(10,0,30,1);
        
        sp=new JSpinner(value);
        sp.setBounds(100,100,200,100);
        c.add(sp);   
        
        lb=new JLabel();
        lb.setBounds(100,300,200,50);
        c.add(lb);
        
        sp.addChangeListener(this);
        
        
    }
    
    @Override
    public void stateChanged(ChangeEvent ce) {
      
        String s=sp.getValue().toString();
        
        lb.setText("Current Value = "+s);
        
    }
    
    
    
    public static void main(String[] args) {

        JSpinnerDemo fr = new JSpinnerDemo();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fr.setBounds(400, 100, 700, 500);
        fr.setTitle("JSpinnerDemo");
        fr.setResizable(false);
    }

    

    
}
