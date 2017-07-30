package com.HackerRank.projecteuler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
class Node{
	int count=0;
	HashMap<Character, HashMap<Character, Node>> map;
}
public class Euler022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		//Node head = new Node();
		TreeMap<Character, ArrayList<String>> countMap = new TreeMap<>();
		
		for(int i=0;i<n;i++){
			String s = scanner.nextLine();
			char c = s.charAt(0);
			if(countMap.containsKey(c)){
				countMap.get(c).add(s);
			}else{
				ArrayList<String> list = new ArrayList<>();
				list.add(s);
				countMap.put(c, list);
			}
		}
//		System.out.println("\nresult:"+countMap);
		//System.exit(0);
		int t = Integer.parseInt(scanner.nextLine());
 		for(int i=0;i<t;i++){
			String search = scanner.nextLine();
			int index=0;
			char start = search.charAt(0);
			for(char c : countMap.keySet()){
				if(c==start){
					findIndex(index, countMap.get(c), search);
				}else{
					index+=countMap.get(c).size();
				}
			}
		}
		scanner.close();
	}

	private static void findIndex(int index, ArrayList<String> arrayList, String search) {
		// TODO Auto-generated method stub
		Collections.sort(arrayList);
		for(String s : arrayList){
			if(s.equals(search)){
				//System.out.println("\nIndex:"+index+1);
				System.out.println((index+1)*(value(search)));
			}else{
				index++;
			}
		}
	}

	private static int value(String search) {
		int sum=0;
		for(char c : search.toCharArray()){
			sum+=c-64;
		}
		//System.out.println("return :"+sum);
		return sum;
		
	}
}