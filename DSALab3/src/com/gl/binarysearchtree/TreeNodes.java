package com.gl.binarysearchtree;

public class TreeNodes {

	int data;
	TreeNodes left;
	TreeNodes right;

	public TreeNodes(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public boolean addNode(TreeNodes root, int data) {
		if (root.left == null) {
			root.left = new TreeNodes(data);
			return true;
		} else if (root.right == null) {
			root.right = new TreeNodes(data);
			return true;
		} else {
			if (!addNode(root.left, data)) {
				addNode(root.right, data);
			}
			return true;
		}
	}
}