package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxDemo1 extends JFrame {

    private Container c;
    private JComboBox cb;
    private String[] s ={"c","c++","java","php","python"};
    
    
    JComboBoxDemo1(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        cb=new JComboBox(s);
        cb.setBounds(50,50,200,50);
        cb.setEditable(true);
        
        System.out.println(cb.getItemCount());
        cb.setSelectedIndex(3);
        cb.setSelectedItem("c++");
        
        cb.addItem("fortan");
        cb.removeItem("c++");
        cb.removeItemAt(2);
        cb.removeAll();
        
        c.add(cb);
        
        
    }
    
    public static void main(String[] args) {

        JComboBoxDemo1 fr = new JComboBoxDemo1();

        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(400, 200, 600, 500);
        fr.setTitle("Combo Box");
        fr.setResizable(false);
    }
}
