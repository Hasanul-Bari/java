package multiplicationtable;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test extends JFrame {

    private Container c;
    private JLabel lb1, lb2;
    private JTextField tf;
    private JButton btn;
    private JTextArea ta;

    private ImageIcon img;

    private Font f;

    private Cursor cr;

    Test() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        img = new ImageIcon(getClass().getResource("mult.jpg"));

        lb1 = new JLabel(img);
        lb1.setBounds(10, 10, img.getIconWidth(), img.getIconHeight());
        c.add(lb1);

        lb2 = new JLabel("Enter any number :");
        lb2.setBounds(10, 220, 200, 50);
        lb2.setForeground(Color.MAGENTA);
        f = new Font("Tahoma", Font.BOLD, 20);
        lb2.setFont(f);
        c.add(lb2);

        tf = new JTextField();
        tf.setBounds(240, 220, 120, 50);
        tf.setBackground(Color.GREEN);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setFont(f);
        c.add(tf);

        btn = new JButton("Clear");
        btn.setBounds(240, 280, 120, 50);
        cr = new Cursor(Cursor.HAND_CURSOR);
        btn.setCursor(cr);
        btn.setFont(f);
        c.add(btn);

        ta = new JTextArea();
        ta.setBounds(10, 340, 350, 320);
        ta.setBackground(Color.GREEN);
        ta.setFont(f);
        c.add(ta);

        tf.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String s = tf.getText();
                

                if (s.isEmpty()) 
                {
                        JOptionPane.showMessageDialog(null,"You did not enter any number");
                } 
                else 
                {

                    ta.setText("");
                    int n = Integer.parseInt(s);
                    for (int i = 1; i <= 10; i++) {
                        int res = i * n;

                        String r = String.valueOf(res);
                        String in = String.valueOf(i);

                        ta.append(s + " X " + in + " = " + r + "\n"); //akta kre line append krbe,,setText() dile append hbe na,last line dekhabe

                    }

                }
            }
        });

        btn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                ta.setText("");
            }

        });

    }

    public static void main(String[] args) {

        Test fr = new Test();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(400, 20, 400, 710);
        fr.setTitle("Multiplication Table");
        fr.setResizable(false);

    }

}
