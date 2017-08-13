package com.HackerRank.practice;

import java.math.BigInteger;
import java.util.Scanner;
//https://www.hackerrank.com/challenges/summing-the-n-series/leaderboard
public class SummingNSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		long sum=0;
		BigInteger b;
		for(int i=0;i<t;i++){
			long l = scanner.nextLong();
			//System.out.println("-->"+Math.pow(l, l));
			//System.out.println("-->"+Math.pow(l, l)%1000000007);
			
			sum=(long) (Math.pow((l%1000000007), 2)%1000000007);
			System.out.println(sum);
		}
		//System.out.println();
		scanner.close();
	}

}
