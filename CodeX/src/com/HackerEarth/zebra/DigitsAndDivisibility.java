/*
 * Question3Max. Marks 100.00
Digits and divisibility.
You have been given a set of digits, where each digit in the set is distinct, and lies in the range from 
0
0 to 
9
9 inclusive. Now, you need to build a 
K
K digit number out of the set of digits given to you.

Each digit from the set can be used arbitrary number of times to build the number. Now, there is an additional restriction : The number built should be such that it should be divisible by 3.

If there exist multiple such numbers, you need to print the smallest 
K
K digit number that can be built using the digits present in the given set. In short, you need to find the smallest 
K
K digit number that is divisible by 
3
3 consisting of only the digits given to you in the set.

The number should be a valid number and should not consist of any leading zeros unless the answer is 
0
0 itself.

Input

First line contains N - number of digits in the set.
Next line contains N space separated digits in increasing order.
Next line contains K - length of output number.

Output

Output the largest possible K digit number which is divisible by 5.(If not possible output -1)

Constraints

1≤ N ≤10
0≤ Digit ≤9
1≤ K ≤105

Sample Input
4
0 4 6 8
2
Sample Output
48
Explanation
The smallest 
2
2 digit number that is divisible by 
3
3 consisting only of the digits 
(0,4,6,8)
(0,4,6,8) is 
48
48.
 */
package com.HackerEarth.zebra;

import java.util.Scanner;

public class DigitsAndDivisibility {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] digits = new int[n];
		for (int i = 0; i < n; i++) {
			digits[i] = scanner.nextInt();
		}
		int k = scanner.nextInt();
		findDigit(n, digits, k);
		scanner.close();
	}

	/*
	 * Find smallest k digit number that is divisible by 3 using numbers from
	 * pool "digits" if number is divisible by 3, it can end with
	 * 3,6,9,8,1,4,7,0,
	 */
	private static void findDigit(int n, int[] digits, int k) {

	}
}