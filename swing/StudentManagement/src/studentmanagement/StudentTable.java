package studentmanagement;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class StudentTable extends JFrame implements ActionListener {

    private Container c;
    private JLabel fnl, lnl, phl, cgl, tlb;
    private JTextField fnf, lnf, phf, cgf;
    private JButton add, upd, dlt, clr;

    private JTable tb;
    private DefaultTableModel model;
    private JScrollPane sp;

    private String[] col = {"First name", "Last name", "Phone number", "CGPA"};//column header
    private String[] row = new String[4];

    StudentTable() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        Font f = new Font("Ariel", Font.BOLD, 16);

        tlb = new JLabel("Student Registration");
        tlb.setBounds(300, 20, 200, 50);
        tlb.setFont(f);
        c.add(tlb);

        fnl = new JLabel("First Name");
        fnl.setBounds(20, 100, 200, 30);
        fnl.setFont(f);
        c.add(fnl);

        fnf = new JTextField();
        fnf.setBounds(150, 100, 250, 30);
        fnf.setFont(f);
        c.add(fnf);

        add = new JButton("ADD");
        add.setBounds(450, 100, 150, 30);
        add.setFont(f);
        c.add(add);

        lnl = new JLabel("Last Name");
        lnl.setBounds(20, 150, 200, 30);
        lnl.setFont(f);
        c.add(lnl);

        lnf = new JTextField();
        lnf.setBounds(150, 150, 250, 30);
        lnf.setFont(f);
        c.add(lnf);

        upd = new JButton("UPDATE");
        upd.setBounds(450, 150, 150, 30);
        upd.setFont(f);
        c.add(upd);

        phl = new JLabel("PHONE");
        phl.setBounds(20, 200, 200, 30);
        phl.setFont(f);
        c.add(phl);

        phf = new JTextField();
        phf.setBounds(150, 200, 250, 30);
        phf.setFont(f);
        c.add(phf);

        dlt = new JButton("DELETE");
        dlt.setBounds(450, 200, 150, 30);
        dlt.setFont(f);
        c.add(dlt);

        cgl = new JLabel("CGPA");
        cgl.setBounds(20, 250, 200, 30);
        cgl.setFont(f);
        c.add(cgl);

        cgf = new JTextField();
        cgf.setBounds(150, 250, 250, 30);
        cgf.setFont(f);
        c.add(cgf);

        clr = new JButton("CLEAR");
        clr.setBounds(450, 250, 150, 30);
        clr.setFont(f);
        c.add(clr);

        tb = new JTable();

        model = new DefaultTableModel();
        model.setColumnIdentifiers(col);
        tb.setModel(model);

        tb.setBackground(Color.WHITE);
        tb.setSelectionBackground(Color.GREEN);
        tb.setFont(f);
        tb.setRowHeight(30);

        sp = new JScrollPane(tb);
        sp.setBounds(20, 350, 700, 300);
        c.add(sp);

        add.addActionListener(this);
        clr.addActionListener(this);
        dlt.addActionListener(this);
        upd.addActionListener(this);
        
        tb.addMouseListener( new MouseAdapter(){
            
            public  void mouseClicked(MouseEvent me){
                
                int rowno=tb.getSelectedRow();
                
                String fn=model.getValueAt(rowno, 0).toString();
                String ln=model.getValueAt(rowno, 1).toString();
                String ph=model.getValueAt(rowno, 2).toString();
                String cg=model.getValueAt(rowno, 3).toString();
                
                fnf.setText(fn);
                lnf.setText(ln);
                phf.setText(ph);
                cgf.setText(cg);
            }
            
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == add) {

            row[0] = fnf.getText();
            row[1] = lnf.getText();
            row[2] = phf.getText();
            row[3] = cgf.getText();

            model.addRow(row);
        } else if (e.getSource() == clr) {

            fnf.setText("");
            lnf.setText("");
            phf.setText("");
            cgf.setText("");
        } else if (e.getSource() == dlt) {

            int rowno = tb.getSelectedRow();

            if (rowno >= 0) {
                model.removeRow(rowno);
            } else {
                JOptionPane.showMessageDialog(null, "NO row is selected or NO row exists");
            }
        }
        
        else if(e.getSource()==upd){
            
            String fn=fnf.getText();
            String ln=lnf.getText();
            String ph=phf.getText();
            String cg=cgf.getText();
            
            int rowno=tb.getSelectedRow();
            
            model.setValueAt(fn, rowno, 0);
            model.setValueAt(ln, rowno, 1);
            model.setValueAt(ph, rowno, 2);
            model.setValueAt(cg, rowno, 3);
        }

    }

    public static void main(String[] args) {

        StudentTable fr = new StudentTable();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fr.setBounds(400, 30, 800, 700);
        fr.setTitle("JSliderDemo");
        fr.setResizable(false);
    }

}
