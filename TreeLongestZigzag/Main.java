package data_structure.TreeLongestZigZag;

public class Main {
	
	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.left.left = new TreeNode(20);
		root.left.left.left = new TreeNode(6);
		
		root.right = new TreeNode(10);
		root.right.right = new TreeNode(15);
		root.right.left = new TreeNode(1);
		root.right.right.right = new TreeNode(8);
		root.right.right.left = new TreeNode(30);
		root.right.right.left.right = new TreeNode(9);
		
		Tree tree = new Tree();
		
		System.out.println(tree.findLongestZigZag(root));
	}

}
