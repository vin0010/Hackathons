package com.HackerRank.practice;


import java.io.*;
import java.util.*;

public class SherlockAndValidString {

   public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int max=0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				int count =map.get(c);
				map.put(c, count + 1);
				if(max<count+1){
					max=count+1;
				}
			} else {
				map.put(c, 1);
				if(max==0){
					max=1;
				}
			}
		}
		//System.out.println("Max is:"+max);
		validate(map, max);
		in.close();
	}
	
	private static void validate(HashMap<Character, Integer> map, int max){
		int count=0;
		for(char c: map.keySet()){
			//System.out.println(c+" = "+map.get(c));
			if(max!=map.get(c)){
				if(max-map.get(c)==1 || max-map.get(c)==(max-1)){
					count++;
				}else{
					System.out.println("NO");
					return;
				}
			}
		}
		if(count==1 || (map.size()-1)==count || count==0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}