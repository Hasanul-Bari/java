package swing;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test3 {
    
    public static void main(String[] args) {
        
        
        ImageIcon img=new ImageIcon("hp.jpg");
        
        
        String s=JOptionPane.showInputDialog(null,"Enter Your name","Title",JOptionPane.QUESTION_MESSAGE);
      
        
        JOptionPane.showMessageDialog(null,"welcome "+s, "Title", JOptionPane.PLAIN_MESSAGE,img);
    }
    
}
