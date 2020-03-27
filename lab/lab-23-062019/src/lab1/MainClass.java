package lab1;

import javax.swing.SwingUtilities;

public class MainClass {

    public static void main(String args[]) {
// Create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(SwingDemo::new);
    }
}
