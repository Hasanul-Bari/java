package swing;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test1 {
    
    public static void main(String[] args) {
        
        String s=JOptionPane.showInputDialog("Enter Your name");
        
        
        ImageIcon img=new ImageIcon("hp.jpg");
        
        JOptionPane.showMessageDialog(null,"welcome"+s, "Title", -1,img);
    }
    
}
