package com.yash.assignment1;
import java.util.Scanner;
import java.util.function.Predicate;

public class EvenOdd {
	public static boolean check (int no)
	{
		Predicate<Integer>prd=p->(p%2==0);
		return prd.test(no);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int no=sc.nextInt();
		if (EvenOdd.check(no)==true)
		{
			System.out.println("number is Even");
		}
		else
		{
			System.out.println("number is Odd");
		}
		
		
	}
	

}
