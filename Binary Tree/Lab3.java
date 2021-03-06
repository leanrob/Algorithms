class BinTree {
	private TNode root;
	private int height, left, right;
	
	public BinTree() {
		root = null;
	}
	public void insert(int x) {
		TNode n = new TNode();
		n.setData(x);
		if(root == null) {
			root = n;
		}
		else {
			TNode temp = root;
			while(temp != null) {
				if(x<temp.getData()){	
					if(temp.getLeft() != null)
						temp = temp.getLeft();
					else {
						temp.setLeft(n);
						break;
					}
				}
				else if(x>temp.getData()) {
					if(temp.getRight() != null)
						temp = temp.getRight();
					else {
						temp.setRight(n);
						break;
					}
				}
				else {
					System.out.println("Error, number already in tree");
					break;
				}
			}
		}
	}
	public boolean search(int y) {
		TNode temp = root;
		while(temp != null) {
			if(y == temp.getData())
				break;
			else if(y>temp.getData())
				temp = temp.getRight();
			else
				temp.getLeft();
		}
		if(temp != null)
			return true;
		else
			return false;
	}
	public int height() {
		height = left = right = -1;
		getHeight(root);
		return height -1;
	}
	public int getHeight(TNode t) {
		if(t == null)
			return 0;
		int heightLeft = getHeight(t.getLeft());
		int heightRight = getHeight(t.getRight());

		if(heightLeft > heightRight)
			return heightLeft -1;
		else
			return heightRight -1;
	}
	public void inorder(TNode t){
		if(t!=null){
			inorder(t.getLeft());
			System.out.print(t.getData() +" ");
			inorder(t.getRight());
		}
	}
	public void preorder(TNode t){
		if(t!=null){
			System.out.print(t.getData() +" ");
			preorder(t.getLeft());
			preorder(t.getRight());
		}
	}
	public void postorder(TNode t){
		if(t!=null){
			postorder(t.getLeft());
			postorder(t.getRight());
			System.out.print(t.getData() +" ");
		}
	}
	public void showInorder(){
		System.out.print("Inorder: ");
		inorder(root);
		System.out.println();
	}
	public void showPreorder(){
		System.out.print("Preorder: ");
		preorder(root);
		System.out.println();
	}
	public void showPostorder(){
		System.out.print("Postorder: ");
		postorder(root);
		System.out.println();
	}
}

class TNode{
	private int data;
	private TNode left, right, parent;
	public TNode(){
		data=0;
		left=right=null;
	}
	public void setData(int data){
		this.data=data;
	}
	public int getData(){
		return data;
	}
	public void setLeft(TNode left){
		this.left=left;
	}
	public TNode getLeft(){
		return left;
	}
	public void setRight(TNode right){
		this.right=right;
	}
	public TNode getRight(){
		return right;
	}
// 	public void setParent(TNode parent){
// 		this.parent=parent;
// 	}
// 	public TNode getParent(){
// 		return parent;
// 	}
}