package com.yash.assignment1;


public class QuetionNo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int a[]= {4,3,5,7,6,8,9,2};
		int count=0;
		for(int i=0;i<=a.length-3;i++)
		{
			int aa=a[i]*a[i];
			int bb=a[i+1]*a[i+1];
			int cc=a[i+2]*a[i+2];
			if (aa==bb+cc || bb==aa+cc|| cc==aa+bb)
			{
				count++;
				
			}
	}
		System.out.println("Combination of numbers satisfy Pythagoras Template:"+count);
	}

}
