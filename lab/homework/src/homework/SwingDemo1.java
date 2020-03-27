package homework;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SwingDemo1 extends JFrame {

    private Container c;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private JTextField j, k;

    SwingDemo1() {

        this.setVisible(true);
        this.setTitle("JFrame Demo ");
        this.setBounds(10, 10, 800, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initialize();
    }

    public void initialize() {
        c = new Container();
        c = this.getContentPane();
        c.setLayout(null);
        //c.setBackground(Color.white);

        btn1 = new JButton("A");
        btn1.setBounds(10, 10, 100, 50);
        c.add(btn1);

        btn2 = new JButton("B");
        btn2.setBounds(120, 10, 100, 50);
        c.add(btn2);

        btn3 = new JButton("HIDE");
        btn3.setBounds(10, 150, 100, 50);
        c.add(btn3);

        j = new JTextField();
        j.setBounds(10, 70, 300, 50);
        c.add(j);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String str = j.getText();
                str += "A";
                j.setText(str);
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String str = j.getText();
                str += "B";
                j.setText(str);
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //dispose();
                //  hide();
                setVisible(false);
            }
        });

    }

    public static void main(String[] args) {
        SwingDemo1 sw = new SwingDemo1();
    }
}
