package com.HackerRank.practice;

import java.util.Scanner;
//https://www.hackerrank.com/challenges/crush/problem
public class AlgorithmicCrush {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		long arr[] = new long[n+1];
		for(int i=0;i<k;i++){
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int x = scanner.nextInt();
			arr[a-1]+=x;
			arr[b]-=x;
		}
		long sum=0, max=0;
		for(int i=0;i<n+1;i++){
			sum+=arr[i];
			max=Math.max(max, sum);
		}
		System.out.println(max);
		scanner.close();
	}

}
