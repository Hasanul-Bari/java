package multiplicationtable;

import javax.swing.JFrame;


public class Main {
    
    public static void main(String[] args) {

        Test fr = new Test();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(400, 20, 400, 710);
        fr.setTitle("Multiplication Table");
        fr.setResizable(false);

    }
    
}
