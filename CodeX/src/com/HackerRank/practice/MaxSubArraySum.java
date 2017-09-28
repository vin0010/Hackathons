package com.HackerRank.practice;

import java.util.Scanner;
import java.util.TreeSet;

//https://www.hackerrank.com/challenges/maximum-subarray-sum
public class MaxSubArraySum {
	private static int lowerIndex(Object[] arr, int n, int x) {
		int l = 0;
		int h = n - 1;
		while (l <= h) {
			int mid = (l + h) / 2;
			if ((long)arr[mid] >= x)
				h = mid - 1;
			else
				l = mid + 1;
		}
		return l;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int q = Integer.parseInt(scanner.nextLine());
		for (int x = 0; x < q; x++) {
			int n = scanner.nextInt();
			long k = scanner.nextLong();
			long arr[] = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextLong();
			}
			findMaxSubArray(arr, k);
		}
		scanner.close();
	}

	private static void findMaxSubArray(long[] arr, long k) {
		// TODO Auto-generated method stub
		TreeSet<Long> myset = new TreeSet<Long>();
		long prefixArray[] = new long[arr.length + 1];
		long sum = 0, max=0;
		for (int i = 0; i < arr.length; i++) {
			sum = (long) ((arr[i] % k + sum) % k);
			myset.add(sum);
			Long ceil = myset.ceiling(sum+1);
			if (ceil==null){
				ceil=(long) 0;	
			}
			max=Math.max(max, (sum-ceil+k)%k);
//			System.out.println(sum+"--"+myset.ceiling(sum+1));
			
//			prefixArray[i + 1] = sum;
		}
		System.out.println(max);
	}

	private static long max(long a, long b) {
		// TODO Auto-generated method stub
		return a > b ? a : b;
	}
}
/*
1
10 10
5 6 7 8 5 5 1 4 6 6
 */