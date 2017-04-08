package com.Venturesity.focuthon;

import java.util.Scanner;

public class VShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			String s = scanner.next();
			int n = scanner.nextInt();
			// System.out.println("Done");
			printV(s.charAt(0), n);
		}
		scanner.close();
	}

	private static void printV(char c, int n) {
		int left = 0, right = 2*(n)-2;
		for (int i = 2*(n)-1; i >= n; i--) {
			String preStr = addSpace(i);
			StringBuffer s = new StringBuffer(preStr);
			s.replace(left, left, c + "");
			if (left < right) {
				s.replace(right, right, c + "");
			}
			System.out.println(s.toString());
			left++;
			right--;
		}
	}

	private static String addSpace(int n) {
		StringBuffer s = new StringBuffer();
		for (int i = 0; i < n; i++) {
			s.append(" ");
		}
		return s.toString();
	}
}