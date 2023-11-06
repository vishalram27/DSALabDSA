package com.gl.balancingbracket;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {

		BalancedBrackets bb = new BalancedBrackets();

		Scanner myObj = new Scanner(System.in);
		String expr = myObj.nextLine();
		myObj.close();

		if (expr == null || expr.isEmpty()) {
			System.out.println("The entered String is empty");
		}

		else if (bb.areBracketsBalanced(expr)) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}

	}

}