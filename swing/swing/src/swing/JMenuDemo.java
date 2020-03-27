package swing;

import com.sun.glass.events.KeyEvent;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class JMenuDemo extends JFrame implements ActionListener {

    private Container c;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem neww, open, exit, cut, copy, paste;

    JMenuDemo() {

        mb = new JMenuBar();
        this.setJMenuBar(mb);

        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");

        mb.add(file);
        mb.add(edit);
        mb.add(help);

        neww = new JMenuItem("New");
        open = new JMenuItem("Open");
        exit = new JMenuItem("Exit");
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");

        file.add(neww);
        file.add(open);
        file.add(exit);

        edit.add(copy);
        edit.add(cut);
        edit.add(paste);

        neww.addActionListener(this);
        exit.addActionListener(this);
        
        
        //keyboard shortcut
       
        neww.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK)); //ctrl+n
        
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == neww) {

            JMenuDemo fr = new JMenuDemo();
            fr.setVisible(true);
            fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            fr.setBounds(500, 100, 700, 500);
            fr.setTitle("NEWMENU");

        } else if (e.getSource() == exit) {

            System.exit(0);
        }
    }

    public static void main(String[] args) {

        JMenuDemo fr = new JMenuDemo();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fr.setBounds(400, 100, 700, 500);
        fr.setTitle("JMenuDemo");
        fr.setResizable(false);
    }

}
