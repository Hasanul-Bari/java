package SlideShow;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlideShowDemo extends JFrame implements ActionListener {

    private Container c;
    private JButton pbtn, nbtn;
    private JPanel jp;

    private ImageIcon icon;
    private JLabel lb;
    private CardLayout cl;

    SlideShowDemo() {

        c = this.getContentPane();

        c.setLayout(null);
        c.setBackground(Color.PINK);

        cl = new CardLayout();

        jp = new JPanel(cl);
        jp.setBounds(15, 10, 660, 380);
        c.add(jp);

        pbtn = new JButton("Previous");
        pbtn.setBounds(15, 400, 100, 50);
        c.add(pbtn);

        nbtn = new JButton("Next");
        nbtn.setBounds(575, 400, 100, 50);
        c.add(nbtn);

        for (int i = 1; i <= 4; i++) {
            
            String x=Integer.toString(i);
            
            x=x+".jpg";
            
            icon = new ImageIcon(getClass().getResource(x));

            //resizing the image
            Image img = icon.getImage();
            Image newimg = img.getScaledInstance(jp.getWidth(), jp.getHeight(), Image.SCALE_SMOOTH);
            // panel er moto resize krbe 

            icon = new ImageIcon(newimg);
            //abar icon e dite hbe resize image

            lb = new JLabel(icon);

            jp.add(lb);
        }
        
        pbtn.addActionListener(this);
        nbtn.addActionListener(this);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==pbtn){
            cl.previous(jp);
        }
        else if(e.getSource()==nbtn){
            cl.next(jp);
        }
            
        
    }

    public static void main(String[] args) {

        SlideShowDemo fr = new SlideShowDemo();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fr.setBounds(400, 100, 700, 500);
        fr.setTitle("SlideShowDemo");
        fr.setResizable(false);
    }

    

}
