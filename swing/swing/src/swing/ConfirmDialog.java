package swing;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ConfirmDialog {
    
    public static void main(String[] args) {
        
        ImageIcon img=new ImageIcon("hp.jpg");
        int choice =JOptionPane.showConfirmDialog(null,"Do you want to Quit?","Title",JOptionPane.YES_NO_CANCEL_OPTION);
        
        System.out.println(choice);
        
        
    }
    
}
