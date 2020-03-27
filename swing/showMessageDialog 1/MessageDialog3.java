import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

class MessageDialog3{

	public static void main(String[] args){
		
		ImageIcon img=new ImageIcon("hp.jpg");
		
		JOptionPane.showMessageDialog(null,"I am Hasan","HP",JOptionPane.PLAIN_MESSAGE,img);
		
	}

}