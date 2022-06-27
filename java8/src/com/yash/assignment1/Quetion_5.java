package com.yash.assignment1;

import java.util.ArrayList;
import java.util.List;

public class Quetion_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] st= {"Pratik","Ajay","Bhushan","Ankush"};
		List<Integer> stcount=new ArrayList<Integer>();
		for(String s: st)
		{
			int count=0;
			char[]a=s.toCharArray();
			for(char ch : a)
			{
				count++;
				
			}
			stcount.add(count);
		}
		Integer max = stcount.stream().max((s1,s2)->s1.intValue()>s2.intValue()?1:-1).get();
		int index = stcount.indexOf(max);
		System.out.println("Longest String in given array:  "+st[index]);
		System.out.println("And count is :"+max);
		}
	
		
		

	}


