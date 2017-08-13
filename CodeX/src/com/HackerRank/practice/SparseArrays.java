package com.HackerRank.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/sparse-arrays
public class SparseArrays {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0;i<n;i++){
			String s = scanner.nextLine();
			if(map.containsKey(s)){
				map.put(s, map.get(s)+1);
			}else{
				map.put(s,1);
			}
		}
		int q = Integer.parseInt(scanner.nextLine());
		for(int i=0;i<q;i++){
			String s=scanner.nextLine();
			if(map.containsKey(s)){
				System.out.println(map.get(s));	
			}else{
				System.out.println(0);
			}
			
		}
		scanner.close();
	}
}