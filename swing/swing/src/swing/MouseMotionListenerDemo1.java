package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MouseMotionListenerDemo1 extends JFrame {

    private Container c;
    private JTextField tf;
    private JTextArea ta;
  

    MouseMotionListenerDemo1() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.magenta);

        tf = new JTextField();
        tf.setBounds(50, 50, 200, 50);
        c.add(tf);

        ta = new JTextArea();
        ta.setBounds(50, 150, 400, 300);
        c.add(ta);
        
        ta.addMouseMotionListener(new MouseMotionListener(){ 
            @Override
            public void mouseDragged(MouseEvent me) {
                
                tf.setText("mouseDragged "+me.getX()+" "+me.getY());
                        
                
            }

            @Override
            public void mouseMoved(MouseEvent me) {
                
                tf.setText("mouseMoved "+me.getX()+" "+me.getY());
            }
            
        });
        
        
        
        
      
       
   

    }

    public static void main(String[] args) {

        MouseMotionListenerDemo1 fr = new MouseMotionListenerDemo1();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fr.setBounds(400, 100, 700, 500);
        fr.setTitle("MouseMotionListener");
        fr.setResizable(false);
    }
}
