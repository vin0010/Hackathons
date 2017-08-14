package com.HackerRank.practice;
//https://www.hackerrank.com/challenges/lucky-numbers/problem
import java.util.HashSet;
import java.util.Scanner;

public class LuckyNumbers {
	private static int getSum(int n) {
		int sum;
		for (sum = 0; n > 0; sum += n % 10, n /= 10)
			;
		return sum;
	}

	private static int getSumSquare(int n) {
		int sum;
		for (sum = 0; n > 0; sum += Math.pow(n % 10, 2), n /= 10)
			;
		return sum;
	}

	public static void main(String[] args) {
		// System.out.println(getSumSquare(14));
		int i =0;
		for (i = 1451; i <= 1459; i+=2) {
			System.out.println("i:" + i + "   Sum :" + getSum(i) + "  Square sum:" + getSumSquare(i));
		}
		System.out.println(i);
		System.exit(0);
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine());
		HashSet<Integer> primeSet = new HashSet<Integer>();
		for (int x = 0; x < t; x++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			findNumberOfLucky(a, b, primeSet);
		}
		scanner.close();
	}

	private static void findNumberOfLucky(int a, int b, HashSet<Integer> primeSet) {
		// TODO Auto-generated method stub
		int counter = 0;
		//int lastDigit =
		
		for(int i=a;i<=b;){
			int digitSum = getSum(a);
			if((digitSum & 1) == 0){//even
				a++;i=a;
			}
			//if(a%10==0){//calculate sum and decide range
			int lastDigit = i%10;
			int nextLimit = i+(9-lastDigit);
			for(int ii=a;a<=nextLimit && ii<=b;ii+=2){
				if(primeSet.contains(ii)){
					counter++;
					continue;
				}else{
					int currentSum = getSum(ii);
					int squareSum = getSumSquare(ii);
					if(isPrime(currentSum) && isPrime(squareSum)){
						counter++;
						primeSet.add(ii);
					}					
				}
			}
				
			//}
		}
	}

	private static boolean isPrime(int currentSum) {
		// TODO Auto-generated method stub
		return false;
	}
}
