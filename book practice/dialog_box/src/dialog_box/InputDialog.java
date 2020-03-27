package dialog_box;

import javax.swing.JOptionPane;


public class InputDialog {
    
    public static void main(String[] args) {
        
        String name=JOptionPane.showInputDialog("What is your name?");
        
        //name="Welcome "+name+" to Java Programming";
        String message=String.format("Welcome %s to Java Programming", name);
        
        JOptionPane.showMessageDialog(null, message);
    }
    
}
