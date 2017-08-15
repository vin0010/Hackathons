package com.HackerRank.practice;


import java.io.*;
import java.util.*;

public class PermutingTwoArrayss {

   public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int t = 0; t < q; t++) {
			int n = in.nextInt();
			int k = in.nextInt();
			
			HashMap<Integer, Integer> aSet = new HashMap<>();
			HashMap<Integer, Integer> bSet = new HashMap<>();
			for (int i = 0; i < n; i++) {
				int key = in.nextInt();
				if(aSet.containsKey(key)){
					aSet.put(key, aSet.get(key)+1);
				}else{
					aSet.put(key, 1);
				}
			}
			for (int i = 0; i < n; i++) {
				int key = in.nextInt();
				if(bSet.containsKey(key)){
					bSet.put(key, bSet.get(key)+1);
				}else{
					bSet.put(key, 1);
				}
			}
			int[] a = new int[n];
			int[] b = new int[n];
			boolean flag=false;
			int counter=0;
			for(int i : aSet.keySet()){
				int temp = aSet.get(i);
				for(int x=0;x<temp;x++){
					a[counter]=i;
					counter++;
					
				}
			}

			counter=n-1;
			for(int i : bSet.keySet()){
				int temp = bSet.get(i);
				for(int x=0;x<temp;x++){
					b[counter]=i;
					counter--;
				}
			}

			for(int i=0;i<n;i++){
				if(a[i]+b[i]<k){
					flag=true;
					break;
				}
			}
			if (flag) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
		in.close();
	}
}