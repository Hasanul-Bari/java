package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ActionDemo6_JComboBox extends JFrame {

    private Container c;
    private JComboBox cb;
    private String[] s ={"c","c++","java","php","python"};
    
    private JLabel lb;
    
    
    ActionDemo6_JComboBox(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        cb=new JComboBox(s);
        cb.setBounds(50,50,200,50);
        cb.setEditable(true);
        c.add(cb);
        
        lb=new JLabel();
        lb.setBounds(300,50,200,50);
        c.add(lb);
        
        cb.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String s=cb.getSelectedItem().toString();
                lb.setText("You have selected "+s);
            }
        });
        
        
    }
    
    public static void main(String[] args) {

        ActionDemo6_JComboBox fr = new ActionDemo6_JComboBox();

        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(400, 200, 600, 500);
        fr.setTitle("Combo Box");
        fr.setResizable(false);
    }
}
