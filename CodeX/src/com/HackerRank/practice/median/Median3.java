package com.HackerRank.practice.median;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Median3 {
	static void pairs(Map<Integer, Boolean> map,char ch,int x) {
		if(ch=='a'){
			map.put(x, true);
		}
		List<Integer> sortedKeys = new ArrayList(map.keySet());
		int size = sortedKeys.size();
		if(ch=='r' && size!=0){
			map.remove(x);
		}
		if(size==0){
			System.out.println("Wrong!");
		}else {
			if(size%2!=0){
				if(size==1){
					Integer y = size;
					System.out.println(y);
				}else{
					System.out.println(sortedKeys.get((size%2)+1));
				}
			}else{
				System.out.println(String.format("%.1f",(float)(sortedKeys.get((size%2))+sortedKeys.get((size%2)+1))/2));
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res;
		Map<Integer, Boolean> map = new TreeMap<Integer, Boolean>();

		int _a_size = Integer.parseInt(in.nextLine());

		int _a_item;
		char _ch;

		for (int _a_i = 0; _a_i < _a_size; _a_i++) {
			String[] next_split = in.nextLine().split(" ");
			_ch=next_split[0].charAt(0);
			_a_item = Integer.parseInt(next_split[1]);
			//System.out.println("Passing :"+_ch+_a_item);
			pairs(map,_ch,_a_item);
		}

	}
}
