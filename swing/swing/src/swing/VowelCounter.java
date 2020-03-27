package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VowelCounter extends JFrame {

    private Container c;
    private JTextArea  ta;
    private JScrollPane scroll;
    private JLabel lb1,alb,elb,ilb,olb,ulb,lb2;
    
    private int t=0,a=0,e=0,i=0,o=0,u=0;

    VowelCounter() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.magenta);

        
        
        lb1=new JLabel("Enter the Text");
        lb1.setBounds(10,40,100,50);
        c.add(lb1);
        
        ta=new JTextArea();
        ta.setWrapStyleWord(true);
        scroll=new JScrollPane(ta);
        scroll.setBounds(100,10,500,100);
       
        
        c.add(scroll);
        
        lb2=new JLabel();
        lb2.setBounds(100,150,200,50);
        c.add(lb2);
        
        alb=new JLabel();
        alb.setBounds(100,200,200,50);
        c.add(alb);
        
        elb=new JLabel();
        elb.setBounds(100,250,200,50);
        c.add(elb);
        
        ilb=new JLabel();
        ilb.setBounds(100,300,200,50);
        c.add(ilb);
        
        olb=new JLabel();
        olb.setBounds(100,350,200,50);
        c.add(olb);
        
        ulb=new JLabel();
        ulb.setBounds(100,400,200,50);
        c.add(ulb);
        
        
        ta.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent ke) {
                
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                
                if(ke.getSource()==ta){
                    
                   
                    if(ke.VK_A==ke.getKeyCode()){
                        a++;
                        t++;
                    }
                    else if(ke.VK_E==ke.getKeyCode()){
                        e++;
                        t++;
                    }
                    else if(ke.VK_I==ke.getKeyCode()){
                        i++;
                        t++;
                    }
                    else if(ke.VK_O==ke.getKeyCode()){
                        o++;
                        t++;
                    }
                    else if(ke.VK_U==ke.getKeyCode()){
                        u++;
                        t++;
                    }
                    
                    lb2.setText("Total number of vowels : "+t);
                    alb.setText("Total number of a's : "+a);
                    elb.setText("Total number of e's : "+e);
                    ilb.setText("Total number of i's : "+i);
                    olb.setText("Total number of o's : "+o);
                    ulb.setText("Total number of u's : "+u);
                    
                }
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                
            }
            
        });
     

    }

    public static void main(String[] args) {

        VowelCounter fr = new VowelCounter();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fr.setBounds(400, 100, 700, 500);
        fr.setTitle("KeyListener");
        fr.setResizable(false);
    }
}
