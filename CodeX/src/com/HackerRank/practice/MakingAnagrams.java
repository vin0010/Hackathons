package com.HackerRank.practice;

//https://www.hackerrank.com/challenges/making-anagrams/problem
import java.util.*;
public class MakingAnagrams {
private static int checkAnagram(String s1, String s2){
		HashMap<Character, Integer> map1 = getTRIEFromString(s1);
		HashMap<Character, Integer> map2 = getTRIEFromString(s2);
		int sum=0;
		for(char i : map1.keySet()){
			if(map2.containsKey(i)){
				sum+=Math.abs(map1.get(i)-map2.get(i));
				map2.remove(i);
			}else{
				sum+=map1.get(i);
			}
		}


		for(char i : map2.keySet()){
			sum+=map2.get(i);
		}
		return sum/2;
	}
	private static HashMap<Character, Integer> getTRIEFromString(String s){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			if(map.containsKey(s.charAt(i))){
				map.put(c , map.get(c)+1);
			}else{
				map.put(c, 1);
			}
		}
		return map;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String a = in.nextLine();
		String b = in.nextLine();
		HashMap<Character, Integer> map1 = getTRIEFromString(a);
		HashMap<Character, Integer> map2 = getTRIEFromString(b);
		int sum=0;
		for(char i : map1.keySet()){
			if(map2.containsKey(i)){
				sum+=Math.abs(map1.get(i)-map2.get(i));
				map2.remove(i);
			}else{
				sum+=map1.get(i);
			}
		}
		for(char i : map2.keySet()){
			sum+=map2.get(i);
		}
		System.out.println(sum);
		//System.out.println(checkAnagram(s.substring(0, s.length()/2), s.substring(s.length()/2)));
		
		in.close();
	}
}