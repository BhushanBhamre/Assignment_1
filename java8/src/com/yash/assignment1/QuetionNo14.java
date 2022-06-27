package com.yash.assignment1;

import java.util.stream.IntStream;

public class QuetionNo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("All Permutation of given String:");
stringPermuteAndPrint("","ABCD");
	}
	private static void stringPermuteAndPrint(String prefix,String str)
	{
		int n=str.length();
		if (n==0) {
			System.out.println(prefix+ " ");
			
		}
		else
		{
			IntStream.range(0, n).parallel().forEach(i->stringPermuteAndPrint(prefix + str.charAt(i),str.substring(i+1,n)+str.substring(0,i)));
		}
	}

}
