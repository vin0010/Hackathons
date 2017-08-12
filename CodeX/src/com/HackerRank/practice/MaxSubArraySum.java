package com.HackerRank.practice;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/maximum-subarray-sum
public class MaxSubArraySum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int q = Integer.parseInt(scanner.nextLine());
		for(int x=0;x<q;x++){
			int n = scanner.nextInt();
			long k = scanner.nextLong();
			long arr[] = new long[n];
			for(int i=0;i<n;i++){
				arr[i]=scanner.nextLong();
			}
			findMaxSubArray(arr, k);
		}
		scanner.close();
	}

	private static void findMaxSubArray(long[] arr, long k) {
		// TODO Auto-generated method stub
		int prefixArray[] = new int[arr.length+1];
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum = (int) ((arr[i]%k + sum)%k);
			prefixArray[i+1] =sum;
		}
//		for(int i: prefixArray){
//			System.out.print(" "+i);
//			
//		}
		//System.exit(0);
		int curr=0;
		for(int i=1;i<prefixArray.length;i++){
			for(int j=i;j<prefixArray.length;j++){
				curr=max(curr,(int) ((prefixArray[j]-prefixArray[i-1]+k)%k));
			}
		}
		System.out.println(curr);
	}

	private static int max(int a, int b) {
		// TODO Auto-generated method stub
		return a>b?a:b;
	}
}