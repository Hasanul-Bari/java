
package rough;

public class Node {
	public Node(){};
	public Node(String chara, int freq){ character = chara; frequency = freq;}
	Node left, right = null;
	String character;
	int frequency;
	String code = "";
}