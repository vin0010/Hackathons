package com.HackerRank.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class SpecialMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);		
		ArrayList<Long> list = new ArrayList<Long>();
		for(int i=1;i<=4159;i++){
			//System.out.println(Integer.toBinaryString(i));
			Long l = Long.valueOf(Integer.toBinaryString(i).replace('1', '9'));
			list.add(l);
		}
		int t = scanner.nextInt();
		for(int x=0;x<t;x++){
			//System.out.println("Counter:"+x);
			int i = scanner.nextInt();
			for(long l : list){
				if(l%i==0){
					System.out.println(l);
					break;
				}
			}
		}
		scanner.close();
	}
}
