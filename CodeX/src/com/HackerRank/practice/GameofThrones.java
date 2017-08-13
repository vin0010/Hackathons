package com.HackerRank.practice;

import java.util.HashMap;
import java.util.Scanner;

public class GameofThrones {

	static void gameOfThrones(String s){
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c : s.toCharArray()){
			if(map.containsKey(c)){
				int v = map.get(c);
				map.put(c, v+1);
			}else{
				map.put(c, 1);
			}
		}
//		System.out.println(map);
		char count = 0;
		for(char c: map.keySet()){
			if(map.get(c)%2!=0){
				if(count!=0){
					count++;
					break;
				}else{
					count++;
				}
			}
		}
//		System.out.println("==>"+count);
		if((s.length()%2==0 && count==0) || (s.length()%2!=0 && count==1)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        gameOfThrones(s);
        //System.out.println(result);
    }

}
