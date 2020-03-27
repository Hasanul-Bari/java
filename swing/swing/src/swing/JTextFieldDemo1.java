package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class JTextFieldDemo1 extends JFrame {
    
    private Container c;
    private JTextField tf;
    private Font f;
    
    
    
    JTextFieldDemo1(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.RED);
        
        tf=new JTextField();
        tf.setBounds(50,150,200,50);
        //tf.setText("Hasan");                  //age theke likha thakbe
        
        f=new Font("Arial",Font.ITALIC+Font.BOLD,16);          // font toiri hoilo
        tf.setFont(f);
        
        tf.setBackground(Color.yellow);    // background color hbe
        tf.setForeground(Color.CYAN);    //text color hbe
        
        tf.setHorizontalAlignment(JTextField.RIGHT);          //alighnment change kre
        
        
        
        c.add(tf);
        
    
        
        
        
    }
    

    
    
    public static void main(String[] args) {
        
        JTextFieldDemo1 fr = new JTextFieldDemo1();

        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //int value 3

        fr.setBounds(400, 200, 500, 400);
        fr.setTitle("JTestDemo");
        fr.setResizable(false);

    }
    
}
