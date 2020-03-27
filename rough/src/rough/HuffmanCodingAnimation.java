package rough;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * This program enables a user to enter text and displays the Huffman coding tree based on the entered text. 
 * The display shows the weight of the subtree inside a subtree's root circle. The character is displayed at each leaf node.
 * The encoded bits are displayed for the text in the dialog box.
 * The decoded text button is used to decode a string of bits int text. 
 */
public class HuffmanCodingAnimation extends JApplet {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private TreeView treeView = new TreeView();
    private Tree tree;

    public HuffmanCodingAnimation(Tree final_tree) {
        tree = final_tree;
        add(new JScrollPane(treeView));
        treeView.setTree(tree);

        String[] codes = getCode(tree.root);
        //System.out.prinln( "\"" + text + "\"" + " is encoded to: " + encode(text, codes));
    }

    /**
     * Decode the bit string into a text
     */
    public String decode(String bits) {
        String result = "";

        Node p = tree.root; // Start from the root
        for (int i = 0; i < bits.length(); i++) {
            if (bits.charAt(i) == '0') {
                p = p.left;
            } else if (bits.charAt(i) == '1') {
                p = p.right;
            } else {
                return null; // Wrong bits
            }
            if (p.left == null) { // A leaf detected
                result += p.character;
                p = tree.root; // Restart from the root
            }
        }

        return result;
    }

    /**
     * Encode the text using the codes
     */
    public static String encode(String text, String[] codes) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            result += codes[text.charAt(i)];
        }
        return result;
    }

    /**
     * Get Huffman codes for the characters This method is called once after a
     * Huffman tree is built
     */
    public static String[] getCode(Node root) {
        if (root == null) {
            return null;
        }
        String[] codes = new String[2 * 128];
        assignCode(root, codes);
        return codes;
    }

    /* Recursively get codes to the leaf node */
    private static void assignCode(Node root, String[] codes) {
        if (root.left != null) {
            root.left.code = root.code + "0";
            assignCode(root.left, codes);

            root.right.code = root.code + "1";
            assignCode(root.right, codes);
        } else {

            codes[(int) root.character.charAt(0)] = root.code;
        }
    }

    // Inner class TreeView for displaying a tree on a panel
    class TreeView extends JPanel {

        /**
         *
         */
        private static final long serialVersionUID = 1L;
        private int radius = 20; // Tree node radius
        private int vGap = 50; // Gap between two levels in a tree
        Tree tree;

        public TreeView() {
        }

        public TreeView(Tree tree) {
            this.tree = tree;
        }

        public void setTree(Tree tree) {
            this.tree = tree;
            repaint();
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            if (tree == null) {
                return;
            }

            if (tree.root != null) {
                // Display tree recursively    
                displayTree(g, tree.root, getWidth() / 2, 30,
                        getWidth() / 4);
            }
        }

        /**
         * Display a subtree rooted at position (x, y)
         */
        private void displayTree(Graphics g, Node root,
                int x, int y, int hGap) {
            // Display the root
            g.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);
            g.drawString(root.frequency + "", x - 6, y + 4);

            if (root.left == null) // Display the character for leaf node
            {
                g.drawString(root.character + "", x - 6, y + 34);
            }

            if (root.left != null) {
                // Draw a line to the left node
                connectLeftChild(g, x - hGap, y + vGap, x, y);
                // Draw the left subtree recursively
                displayTree(g, root.left, x - hGap, y + vGap, hGap / 2);
            }

            if (root.right != null) {
                // Draw a line to the right node
                connectRightChild(g, x + hGap, y + vGap, x, y);
                // Draw the right subtree recursively
                displayTree(g, root.right, x + hGap, y + vGap, hGap / 2);
            }
        }

        /**
         * Connect a parent at (x2, y2) with its left child at (x1, y1)
         */
        private void connectLeftChild(Graphics g,
                int x1, int y1, int x2, int y2) {
            double d = Math.sqrt(vGap * vGap + (x2 - x1) * (x2 - x1));
            int x11 = (int) (x1 + radius * (x2 - x1) / d);
            int y11 = (int) (y1 - radius * vGap / d);
            int x21 = (int) (x2 - radius * (x2 - x1) / d);
            int y21 = (int) (y2 + radius * vGap / d);
            g.drawLine(x11, y11, x21, y21);
            g.drawString("0", (x11 + x21) / 2 - 5, (y11 + y21) / 2);
        }

        /**
         * Connect a parent at (x2, y2) with its right child at (x1, y1)
         */
        private void connectRightChild(Graphics g,
                int x1, int y1, int x2, int y2) {
            double d = Math.sqrt(vGap * vGap + (x2 - x1) * (x2 - x1));
            int x11 = (int) (x1 - radius * (x1 - x2) / d);
            int y11 = (int) (y1 - radius * vGap / d);
            int x21 = (int) (x2 + radius * (x1 - x2) / d);
            int y21 = (int) (y2 + radius * vGap / d);
            g.drawLine(x11, y11, x21, y21);
            g.drawString("1", (x11 + x21) / 2 + 5, (y11 + y21) / 2);
        }

        public Dimension getPreferredSize() {
            return new Dimension(300, 300);
        }
    }
}
