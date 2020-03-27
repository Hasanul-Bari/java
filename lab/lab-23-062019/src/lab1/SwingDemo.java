package lab1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingDemo {

    SwingDemo() {

        JFrame jfrm = new JFrame("A Simple Swing Application");
        // Give the frame an initial size.
        jfrm.setSize(275, 100);
// Terminate the program when the user closes the application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jfrm.setLocationRelativeTo(null);
        
// Create a text-based label.
        JLabel jlab = new JLabel(" My name is Hasanul Bari");
        JLabel jlab1 = new JLabel("From Bangladesh");
        
// Add the label to the content pane.
        jfrm.add(jlab);
        
        JButton jbtn= new JButton("Change") ;
        jbtn.setActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                jlab.setTest("Sad");
            }
        });
        
        jfrm.add(jbtn);
        
        
        
// Display the frame.
        jfrm.setVisible(true);

    }
}
