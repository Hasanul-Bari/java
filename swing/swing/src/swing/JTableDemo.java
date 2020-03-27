package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableDemo extends JFrame {
    
    private Container c;
    
    private JTable tb;
    private JScrollPane sp;
    
    private String[] col={"ID","Name","CGPA"};
    
    private String[][] row={
        {"1702065","Hasan","3.90"}, 
        {"1602022","Moshiur","3.96"}, 
        {"1702034","Jisan","4.00"}, 
        {"1602013","Bushra","3.97"}, 
        
        
    };
   
  
    
    JTableDemo() {

        c = this.getContentPane();

        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        tb=new JTable(row,col);
        
        tb.setSelectionBackground(Color.RED);
        
        sp=new JScrollPane(tb);
        sp.setBounds(50,100,500,300);
        
        c.add(sp);
        
       
        
       
        
       
        
    }
    
  
    
    
    
    public static void main(String[] args) {

        JTableDemo fr = new JTableDemo();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fr.setBounds(400, 100, 700, 600);
        fr.setTitle("JTableDemo");
        fr.setResizable(false);
    }

    

    
}
       
