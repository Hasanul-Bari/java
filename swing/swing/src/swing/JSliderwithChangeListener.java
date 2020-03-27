package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderwithChangeListener extends JFrame implements ChangeListener {
    
    private Container c;
    private JLabel rlb,glb,blb;
    private JSlider rs,gs,bs;
    private JTextField rtf,gtf,btf;
    private JPanel jp; 
    
   
   
    JSliderwithChangeListener() {

        c = this.getContentPane();

        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        rlb=new JLabel("Red");
        rlb.setBounds(30,50,50,50);
        c.add(rlb);
        
        rs=new JSlider(0,255,0);
        rs.setBounds(100,50,300,50);
        c.add(rs);
        
        glb=new JLabel("Green");
        glb.setBounds(30,150,50,50);
        c.add(glb);
        
        gs=new JSlider(0,255,0);
        gs.setBounds(100,150,300,50);
        c.add(gs);
        
        blb=new JLabel("Blue");
        blb.setBounds(30,250,50,50);
        c.add(blb);
        
        bs=new JSlider(0,255,0);
        bs.setBounds(100,250,300,50);
        c.add(bs);
        
        
        rtf=new JTextField();
        rtf.setBounds(420,50,100,50);
        c.add(rtf);
        
        gtf=new JTextField();
        gtf.setBounds(420,150,100,50);
        c.add(gtf);
        
        btf=new JTextField();
        btf.setBounds(420,250,100,50);
        c.add(btf);
        
        jp=new JPanel();
        jp.setBounds(550,100,200,200);
        jp.setBackground(Color.yellow);
        c.add(jp);
        
        
        rs.addChangeListener(this);
        gs.addChangeListener(this);
        bs.addChangeListener(this);
        
       
        
        
    }
    
    @Override
    public void stateChanged(ChangeEvent ce) {
        
        int r=rs.getValue();
        int g=gs.getValue();
        int b=bs.getValue();
        
        rtf.setText(""+r);
        gtf.setText(""+g);
        btf.setText(""+b);
        
        Color color=new Color(r,g,b);
        jp.setBackground(color);
    }
    
    
    
    public static void main(String[] args) {

        JSliderwithChangeListener fr = new JSliderwithChangeListener();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fr.setBounds(400, 100, 800, 500);
        fr.setTitle("JSliderDemo");
        fr.setResizable(false);
    }

    

    
}
