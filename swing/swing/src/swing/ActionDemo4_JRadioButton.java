package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class ActionDemo4_JRadioButton extends JFrame {

    private Container c;
    private JRadioButton rb1, rb2;
    private ButtonGroup grp;

    private Font f;

    private JTextArea ta;

    ActionDemo4_JRadioButton() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        f = new Font("Arial", Font.BOLD, 20);

        rb1 = new JRadioButton("male");
        rb1.setBounds(50, 20, 100, 50);
        rb1.setFont(f);
        c.add(rb1);

        rb2 = new JRadioButton("female");
        rb2.setBounds(200, 20, 100, 50);
        rb2.setFont(f);
        c.add(rb2);

        grp = new ButtonGroup();
        grp.add(rb1);
        grp.add(rb2);

        ta = new JTextArea();
        ta.setBounds(50, 100, 400, 300);
        ta.setBackground(Color.PINK);
        ta.setFont(f);
        c.add(ta);

        Handler handler = new Handler();
        rb1.addActionListener(handler);
        rb2.addActionListener(handler);
        

    }

    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e)
        {
               if(e.getSource()==rb1)              //   if(rb1.isSelected())  etao likha jabe
               {
                   ta.append("You have selected male\n");
               }
               else
               {
                   ta.append("You have selected female\n");
               }
        }

    }

    public static void main(String[] args) {

        ActionDemo4_JRadioButton fr = new ActionDemo4_JRadioButton();

        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(400, 200, 500, 500);
        fr.setTitle("Radio Button");
        fr.setResizable(false);

    }

}
