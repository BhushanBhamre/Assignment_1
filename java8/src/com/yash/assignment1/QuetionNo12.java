package com.yash.assignment1;

interface AA
{
	void third(int a[]);
	
}

public class QuetionNo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA obj=(a)->{
			int len=a.length;
			for (int i=0;i<len;i++)
			{
				for(int j=i+1;j<len;j++)
				{
					if(a[i]>a[j])
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
						
					}
				}
			}
			for(int k =1;k<=5;k++)
			{
				System.out.println("largest element :"+k+" "+a[len-k]);
			}
		};
		int a[]= {10,20,30,40,50,60,70,80,90};
		obj.third(a);
	}
}
