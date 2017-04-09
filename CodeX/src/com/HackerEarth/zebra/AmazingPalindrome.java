/**
 * 
 */
package com.HackerEarth.zebra;

/**
 * @author Vinoth
 *
 *Amazing Palindromes
Mark has a string composed of a's and b's and he would like to know the number of sub strings of the main string which can be considered as an AMAZING PALINDROME.

A palindrome is a string that is same as its reverse string.

Mark has got a condition, that all the consecutive a's and b's will be compressed to only single character . Example: abaaab will be compressed to abab.

Mark defines Amazing palindrome as a string which will result in a palindrome after the compression has been completed.(See sample for better explanation).

You have to help him calculate the number of sub strings which are amazing palindromes.

INPUT

A single line containing Mark's string.

OUTPUT

Output the number of sub strings that can be considered as amazing palindromes.

Constraints

1≤|S|≤10^5
1≤|S|≤10^5 where |S| is the length of the given string.

Sample Input
abaa
Sample Output
7
Explanation
Consider the substrings:
{a,ab,aba,abaa,b,ba,baa,a,aa,a} 
Out of these sub strings,amazing palindromes are: a,aba,abaa, b,a,aa,a
Thus there are 7 substrings which can be considered as amazing palindromes.
 */
public class AmazingPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
