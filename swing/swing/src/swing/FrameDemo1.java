
package swing;

import javax.swing.JFrame;

public class FrameDemo1 {
    
    public static void main(String[] args) {
        
        JFrame fr=new JFrame();
        
        fr.setVisible(true);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //int value 3
        
        //fr.setSize(500, 400);
        //fr.setLocationRelativeTo(null);  //center a anbe
        
        //fr.setLocation(200, 50);
        
        fr.setBounds(200,50,400,400);
        fr.setTitle("Title");
        fr.setResizable(false);
        
        
    }
    
}
