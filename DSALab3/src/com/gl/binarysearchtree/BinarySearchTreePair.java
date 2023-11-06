package com.gl.binarysearchtree;

import java.util.HashSet;

public class BinarySearchTreePair {

	static TreeNodes insert(TreeNodes root, int key) {
		if (root == null)
			return null;
		if (key < root.data)
			root.left = insert(root.left, key);
		else
			root.right = insert(root.right, key);
		return root;
	}

	static boolean findpair(TreeNodes root, int sum, HashSet<Integer> set) {

		if (root == null)
			return false;

		if (findpair(root.left, sum, set))
			return true;

		if (set.contains(sum - root.data)) {
			System.out.println("Pair is (" + (sum - root.data) + ", " + root.data + ")");
			return true;
		} else
			set.add(root.data);

		return findpair(root.right, sum, set);
	}

	static void findPair(TreeNodes root, int sum) {
		HashSet<Integer> set = new HashSet<Integer>();
		if (!findpair(root, sum, set))
			System.out.print("Pairs do not exit \n");
	}
}