package com.yash.assignment1;

import java.util.Arrays;
import java.util.List;

public class Distinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= Arrays.asList(1,2,2,3,3,4,4,5);
		
		System.out.println("The Distinct elements are:");
		list.stream().distinct().forEach(System.out::println);

	}

}
