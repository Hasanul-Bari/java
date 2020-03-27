/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rough;

public class Tree implements Comparable<Tree>{
	Node root;
	
    public Tree(Tree t1, Tree t2) {
        root = new Node();
        root.left = t1.root;
        root.right = t2.root;
        root.frequency = t1.root.frequency + t2.root.frequency;
      }
      
      /** Create a tree containing a leaf node */
      public Tree(String element, int frequency) {
        root = new Node(element, frequency);
      }
      
      /** Compare trees based on their weights */
      public int compareTo(Tree o) {
        if (root.frequency < o.root.frequency) // Purposely reverse the order
          return 1;
        else if (root.frequency == o.root.frequency)
          return 0;
        else
          return -1;
      }
}