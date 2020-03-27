package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JTabbedPaneDemo extends JFrame {
    
    private Container c;
    private JTabbedPane tp;
    private JPanel jp1,jp2,jp3;
  
    
    JTabbedPaneDemo() {

        c = this.getContentPane();

        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        tp=new JTabbedPane();
        tp.setBounds(50,100,400,400);
        c.add(tp);
        
        jp1=new JPanel();
        jp1.setBackground(Color.RED);
        
        jp2=new JPanel();
        jp2.setBackground(Color.CYAN);
        
        jp3=new JPanel();
        jp3.setBackground(Color.YELLOW);
        
        tp.add("Home", jp1);
        tp.add("Edit", jp2);
        tp.add("View", jp3);
        
        
        
       
        
       
        
    }
    
  
    
    
    
    public static void main(String[] args) {

        JTabbedPaneDemo fr = new JTabbedPaneDemo();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fr.setBounds(400, 100, 700, 600);
        fr.setTitle("JTabbedPaneDemo");
        fr.setResizable(false);
    }

    

    
}
       
