package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JSlider;

public class JSliderDemo extends JFrame  {
    
    private Container c;
    private JSlider js;
   
   
    JSliderDemo() {

        c = this.getContentPane();

        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        js=new JSlider(0,20,0);
        js.setBounds(50,50,300,50);
        js.setMinorTickSpacing(1);
        js.setMajorTickSpacing(5);
        js.setPaintTicks(true);
        js.setPaintLabels(true);
        
        c.add(js);
        
       
        
        
    }
    
    
    
    public static void main(String[] args) {

        JSliderDemo fr = new JSliderDemo();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fr.setBounds(400, 100, 700, 500);
        fr.setTitle("JSliderDemo");
        fr.setResizable(false);
    }

    
}
