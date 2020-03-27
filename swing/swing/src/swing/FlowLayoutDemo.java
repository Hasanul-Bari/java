package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo extends JFrame{
    
    private FlowLayout fl;
    
    private Container c;
    private JButton btn[];

   
   FlowLayoutDemo(){
       
       fl=new FlowLayout(FlowLayout.LEFT,10,5);
       
       
       
       c = this.getContentPane();
       c.setLayout(fl);
       c.setBackground(Color.magenta);
       
      
       btn=new JButton[100];
       
       for(int i=0; i<100; i++){
           btn[i]=new JButton(""+(i+1));
           
           c.add(btn[i]);
       }
       
      
       
       
               
   }
    

    public static void main(String[] args) {
        
        FlowLayoutDemo fr = new FlowLayoutDemo();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fr.setBounds(400, 100, 700, 500);
        fr.setTitle("FlowLayoutDemo");
        fr.setResizable(false);
    }
    
}

