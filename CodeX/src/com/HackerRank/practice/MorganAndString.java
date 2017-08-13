package com.HackerRank.practice;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/morgan-and-a-string
public class MorganAndString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		for(int i=0;i<n;i++){
			String a = scanner.nextLine();
			String b = scanner.nextLine();
			if(a.length()>b.length()){
				lexicographicalMerge(b,a);	
			}else{
				lexicographicalMerge(a,b);
			}
			
		}
		scanner.close();
	}

	private static void lexicographicalMerge(String a, String b) {
		// TODO Auto-generated method stub
		//StringBuilder s = new StringBuilder();
		char aarr[] = a.toCharArray();
		char barr[] = b.toCharArray();
		char res[] = new char[a.length()+b.length()];
		int i=0, j=0, counter=0;
		for(;i<a.length()&&j<b.length();){
			if(aarr[i]<barr[j]){
				res[counter]= aarr[i];
				i++;
			}else if(aarr[i]>barr[j]){
				res[counter]= barr[j];
				j++;
			}else{//decide which one to take lexicographically
				
			}
			counter++;
		}
		System.out.println("Counter:"+counter+"\t i:"+i+"\t j"+j);
		if(i<a.length()){
			for(;i<aarr.length;i++){
				res[counter]=aarr[i];
				counter++;
			}
		}else if(j<b.length()){
			for(;j<barr.length;j++){
				res[counter]=barr[j];
				counter++;
			}
		}
		for(;counter<b.length();counter++){
			res[counter]=barr[counter];
		}
		for(char c: res){
			System.out.print(c);
		}
	}
}
