package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyListenerDemo1 extends JFrame {

    private Container c;
    private JTextField tf;
    private JTextArea ta;

    KeyListenerDemo1() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.magenta);

        tf = new JTextField();
        tf.setBounds(50, 50, 150, 50);
        c.add(tf);

        ta = new JTextArea();
        ta.setBounds(50, 150, 400, 300);
        c.add(ta);
        
        
        tf.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent ke) {
                ta.append("keyTyped "+ke.getKeyChar()+"\n");
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                 ta.append("keyPressed "+ke.getKeyChar()+"\n");
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                ta.append("keyReleased "+ke.getKeyChar()+"\n");
            }
            
        });
        
   

    }

    public static void main(String[] args) {

        KeyListenerDemo1 fr = new KeyListenerDemo1();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fr.setBounds(400, 100, 700, 500);
        fr.setTitle("KeyListener");
        fr.setResizable(false);
    }
}
