package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MouseListenerDemo1 extends JFrame {

    private Container c;
    private JTextField tf;
    private JTextArea ta;
    private JScrollPane sp;

    MouseListenerDemo1() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.magenta);

        tf = new JTextField();
        tf.setBounds(50, 50, 150, 50);
        c.add(tf);

        ta = new JTextArea();
        sp =new JScrollPane(ta);
        sp.setBounds(50, 150, 400, 300);
        c.add(sp);
        
        
       tf.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {
                ta.append("mouseClicked\n");
            }

            @Override
            public void mousePressed(MouseEvent me) {
                ta.append("mousePressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                ta.append("mouseReleased\n");
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                ta.append("mouseEntered\n");
            }

            @Override
            public void mouseExited(MouseEvent me) {
                ta.append("mouseExited\n");
            }
           
       });
        
   

    }

    public static void main(String[] args) {

        MouseListenerDemo1 fr = new MouseListenerDemo1();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fr.setBounds(400, 100, 700, 500);
        fr.setTitle("MouseListener");
        fr.setResizable(false);
    }
}
