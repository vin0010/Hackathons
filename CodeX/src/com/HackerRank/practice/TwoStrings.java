package com.HackerRank.practice;
import java.util.HashMap;
//https://www.hackerrank.com/challenges/two-strings
import java.util.Scanner;

public class TwoStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		for(int i=0;i<n;i++){
			String a = scanner.nextLine();
			String b = scanner.nextLine();
//			System.out.println("A:"+a);
//			System.out.println("B:"+b);
			checkIfCommonSubString(a,b);
		}
		scanner.close();
	}

	private static void checkIfCommonSubString(String a, String b) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> amap = getCountMap(a);
		HashMap<Character, Integer> bmap = getCountMap(b);
//		System.out.println("Map1:"+amap);
//		System.out.println("Map2:"+bmap);
		boolean flag = false;
		for(char c: amap.keySet()){
			if(bmap.containsKey(c)){
				flag=true;
				System.out.println("YES");
				break;
			}
		}
		if(!flag){
			System.out.println("NO");
		}
	}

	private static HashMap<Character, Integer> getCountMap(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c : s.toCharArray()){
			if(map.containsKey(c)){
				int v = map.get(c);
				map.put(c, v+1);
			}else{
				map.put(c, 1);
			}
		}
		return map;
	}
}
