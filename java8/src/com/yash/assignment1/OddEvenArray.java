package com.yash.assignment1;

import java.util.function.Predicate;

public class OddEvenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p= i-> i%2 ==0;
		int even=0,odd=0;
		int num[]= {1,2,3,4,5,6,7,8,9,10,11};
		for (int n:num)
		{
			if(p.test(n))
			{
				even++;
			}
			else
			{
				odd++;
				
			}
		}
		System.out.println("even count:"+even);
		System.out.println("odd"+ "count:"+odd);

	}

}
