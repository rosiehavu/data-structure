package data_structure.TreeLongestZigZag;

public class Tree {
	
public int maxLength = 0;
	
	public void dfs(TreeNode node, boolean turnLeft, int count) {
		if (node == null) {
			return;
		}
		
		maxLength = Math.max(maxLength, count);
		
		if (turnLeft) {
			dfs(node.left, true, 0);
			dfs(node.right, false, count + 1);
		} else {
			dfs(node.left, true, count + 1);
			dfs(node.right, false, 0);
		}
	}
	
	public int findLongestZigZag(TreeNode root) {
		if (root == null) {
			return 0;
		}
		
		maxLength = 0;
		
		dfs(root.left, true, 0);
		dfs(root.right, false, 0);
		
		return maxLength;
	}

}
