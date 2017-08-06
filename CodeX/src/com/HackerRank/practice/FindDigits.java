package com.HackerRank.practice;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/find-digits
public class FindDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine());
		for(int i=0;i<t;i++){
			int curr = scanner.nextInt();
			findDigit(curr);
		}
		scanner.close();
	}

	private static void findDigit(int curr) {
		// TODO Auto-generated method stub
		int count=0, curr1=curr;
		while(curr1!=0) {
			int i = curr1%10;
			if(i!=0){
				//System.out.println("i:"+i+" curr1:"+curr1);
				if(curr%i==0){
					count++;
				}				
			}
			curr1=curr1/10;		
		} 
		System.out.println(count);
	}
}
