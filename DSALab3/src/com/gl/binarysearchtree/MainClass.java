package com.gl.binarysearchtree;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		/*
		 * I didn't hardcoded the value, Since, this method is helpful to learn the
		 * things better
		 */

		// TreeNodes root = new TreeNodes(40);
		// root.left = new TreeNodes(20);
		// root.right = new TreeNodes(60);
		//
		// root.left.left = new TreeNodes(10);
		// root.left.right = new TreeNodes(30);
		//
		// root.right.left = new TreeNodes(50);
		// root.right.right = new TreeNodes(70);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of element in tree: ");
		int n = scanner.nextInt();
		System.out.println("Enter the root element: ");
		TreeNodes root = new TreeNodes(scanner.nextInt());
		for (int i = 1; i < n; i++) {
			root.addNode(root, scanner.nextInt());
		}
		System.out.print("Sum = ");
		int sum = scanner.nextInt();
		scanner.close();

		BinarySearchTreePair.findPair(root, sum);

	}

}
