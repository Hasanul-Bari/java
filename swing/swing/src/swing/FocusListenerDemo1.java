package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FocusListenerDemo1 extends JFrame {

    private Container c;
    private JButton btn;
    private JTextArea ta;
    private JScrollPane sp;

    FocusListenerDemo1() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.magenta);

        btn = new JButton("Click");
        btn.setBounds(50, 50, 150, 50);
        c.add(btn);

        ta = new JTextArea();
        sp =new JScrollPane(ta);
        sp.setBounds(50, 150, 400, 300);
        c.add(sp);
        
        btn.addFocusListener(new FocusListener(){ 
            @Override
            public void focusGained(FocusEvent fe) {
                ta.append("focusGained\n");
            }

            @Override
            public void focusLost(FocusEvent fe) {
                ta.append("focusLost\n");
            }
            
        });
        
        
   
        
   

    }

    public static void main(String[] args) {

        FocusListenerDemo1 fr = new FocusListenerDemo1();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fr.setBounds(400, 100, 700, 500);
        fr.setTitle("FocusListener");
        fr.setResizable(false);
    }
}
