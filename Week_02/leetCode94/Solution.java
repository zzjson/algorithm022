package leetCode94;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> inorderTraversal(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<>();
		inorder(root, list);
		return list;
	}

	public void inorder(TreeNode root, List<Integer> list) {
		if (root == null) {
			return;
		}
		inorder(root.left, list);
		list.add(root.val);
		inorder(root.right, list);
	}
}