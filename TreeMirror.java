
public class TreeMirror {

	public static void main(String[] args) {
		TreeMirror tm = new TreeMirror();
		Node n2a = new Node(2);
		Node n2b = new Node(1);

		Node n1l = new Node(5, n2a,n2b); 
		Node root = new Node(2, n1l, null);
		//	tm.mirrorTree(n2a, n1l);
		tm.printTree(root);
	}
	
	public Node printTree(Node n){
		if(!(n==null))
			return null;
		
		
		
		System.out.print(n);
		
		printTree(n.getChildRight());
		return printTree(n.getChildLeft());
	}

	public Node mirrorTree(Node node){
		if(!(node==null)){
			
		
		//	node.setNodeId(here.getNodeId());
			//node.setChildLeft(mirrorTree(node, here.getChildRight()));
			//node.setChildRight(mirrorTree(node, here.getChildLeft()));
		

		}
		return node;
		
	}

	
}

 class Node {
	private int id;
	private Node childRight;
	private Node childLeft;

	public Node(int value) {
		this.id=value;
		this.childLeft=null;
		this.childRight=null;
	}

	public Node(int value, Node left, Node right) {
		this.id=id;
		this.childLeft=left;
		this.childRight=right;
	}

	public int getNodeId() {
		return id;
	}

	public void setNodeId(int id) {
		this.id=id;

	}

	public Node getChildRight() {
		return childRight;
	}

	public void setChildRight(Node right){
		this.childRight=right;
	}

	public void setChildLeft(Node left){
		this.childLeft=left;
	}

	public Node getChildLeft() {
		return childLeft;
	}
}

