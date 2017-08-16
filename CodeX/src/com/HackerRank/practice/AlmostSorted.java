package com.HackerRank.practice;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/almost-sorted/problem
public class AlmostSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
//		int a[] ={1, 2, 8, 7, 6, 5, 4, 3, 9, 10};
//		int a[] ={1, 2, 8, 7, 6, 5, 2, 3, 9, 10};
//		System.out.println(isDescending(a, 2, 8));
//		System.out.println(isSorted(a, 2, 8));
//		System.exit(0);
		int n = Integer.parseInt(scanner.nextLine());
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = scanner.nextInt();
		}
//		System.out.print("Array:");
//		for(int i=0;i<n;i++){
//			System.out.print(" "+arr[i]);
//		}
		int d1=-1, d2=n+1;
		d1 = findD1(n, arr, d1);
//		System.out.println("\nd1 :"+d1);
		if(d1==-1){
			System.out.println("yes");
		}else{
			for(int j=n-1;j>=0;j--){
				if(d2 ==n+1){
					if(arr[j]<arr[d1]){
						d2=j;
						break;
					}				
				}
			}	
		}
		check(arr,d1,d2);
//		System.out.println("\nd1:"+d1 + " d2:"+d2);
		scanner.close();
	}

	private static int findD1(int n, int[] arr, int d1) {
		for(int i=0;i<n-1;i++){
			if(d1 ==-1){
				if(arr[i]>arr[i+1]){
					d1=i;
				}				
			}
		}
		return d1;
	}

	private static void check(int[] arr, int d1, int d2) {
		// TODO Auto-generated method stub
		if(d1 ==-1 || d2 ==arr.length+1){
			System.out.println("yes");
			return;
		}
		int diffCount = Math.abs(d1-d2);
		if(diffCount==1){//is it necessary? cant be handled as part of next codition?
			System.out.println("yes");
			System.out.println("swap "+(d1+1)+" "+(d2+1));
		}//else if(d1==0 && d2==arr.length-1){			}
		else{
			if(isSorted(arr,d1+1,d2-1)){
				System.out.println("yes");
				System.out.println("swap "+(d1+1)+" "+(d2+1));
			}else if(isDescending(arr,d1,d2)){
				System.out.println("yes");
				System.out.println("reverse "+(d1+1)+" "+(d2+1));
			}else{
				System.out.println("no");
			}
		}
	}

	private static boolean isDescending(int[] arr, int d1, int d2) {
		// TODO Auto-generated method stub
		for(int i=d1;i<d2;i++){
			//System.out.print(" "+arr[i]);
			if(arr[i]<arr[i+1]){
				//System.out.println("Breaking for :"+arr[i]+" and "+arr[i+1]);
				return false;
			}
		}
		return true;
	}

	private static boolean isSorted(int[] arr, int d1, int d2) {
		// TODO Auto-generated method stub
		for(int i=d1;i<d2;i++){
			if(arr[i]>arr[i+1]){
				return false;
			}
		}
		return true;
	}
	//10
	//1 2 8 7 6 5 4 3 9 10
}
