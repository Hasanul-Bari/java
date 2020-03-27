package swing;

import javax.swing.JFrame;

public class FrameDemo2 extends JFrame {

    FrameDemo2() {
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //int value 3

        setBounds(200, 50, 400, 400);
        setTitle("Title");
        setResizable(false);
    }

    public static void main(String[] args) {

        FrameDemo2 fr = new FrameDemo2();

        

    }

}
