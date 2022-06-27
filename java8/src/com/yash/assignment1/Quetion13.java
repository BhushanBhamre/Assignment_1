package com.yash.assignment1;

public class Quetion13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,2,3,6,7,8,10,11,12,13,14,17,18,19,20};
		for (int j=0;j<array.length;j++)
		{
			if (j<=4)
			{
				String o=array[j]+"-"+(array[j+2]);
					System.out.println(o+",");
					j=j+2;
			}
			else if(j<=10) {
				String o=array[j]+"-"+(array[j+4]);
				System.out.println(o+",");
				j=j+4;
			}
			else {
				String o=array[j]+"-"+(array[j+3]);
				System.out.println(o+",");
				j=j+3;
				
			}
		}

	}
}
