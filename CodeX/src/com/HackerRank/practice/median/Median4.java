package com.HackerRank.practice.median;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Median4 {
	static void pairs(ArrayList<Integer> sortedKeys, char ch, int x) {
		if (ch == 'a') {
			sortedKeys.add(x);
		}
		int size = sortedKeys.size();
		if (ch == 'r' && size != 0) {
			// System.out.println(size + "====");
			Integer xx = new Integer(x);
			sortedKeys.remove(xx);
			size--;
		}
		Collections.sort(sortedKeys);
		if (size == 0) {
			System.out.println("Wrong!");
		} else {
			if (size % 2 != 0) {
				if (size == 1) {
					Integer y = size;
					System.out.println(y);
				} else {
					System.out.println(sortedKeys.get((size % 2) + 1));
				}
			} else {
				if (size != 2)
					System.out.println(String.format("%.1f", (float) (sortedKeys.get((size % 2)) + sortedKeys.get((size % 2) + 1)) / 2));
				if (size == 2)
					System.out.println(String.format("%.1f", (float) ((sortedKeys.get(0) + sortedKeys.get(1)) / 2)));
			}
		}
		// TODO

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res;
		// Map<Integer, Boolean> map = new TreeMap<Integer, Boolean>();
		ArrayList<Integer> list = new ArrayList<Integer>();

		int _a_size = Integer.parseInt(in.nextLine());

		int _a_item;
		char _ch;

		for (int _a_i = 0; _a_i < _a_size; _a_i++) {
			String[] next_split = in.nextLine().split(" ");
			_ch = next_split[0].charAt(0);
			_a_item = Integer.parseInt(next_split[1]);
			// System.out.println("Passing :"+_ch+_a_item);
			pairs(list, _ch, _a_item);
		}

	}
}
