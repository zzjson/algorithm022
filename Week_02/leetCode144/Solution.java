package leetCode144;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> preorderTraversal(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<>();
		inorder(root, list);
		return list;
	}

	public void inorder(TreeNode root, List<Integer> list) {
		if (root == null) {
			return;
		}
		list.add(root.val);
		inorder(root.left, list);
		inorder(root.right, list);
	}
}