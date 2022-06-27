package com.yash.assignment1;

import java.util.Arrays;
import java.util.List;

public class DistinctEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list = Arrays.asList("Bhushan","Ankush","Pratik","Ajay","Ankush","Rakesh");
System.out.println("The distinct names of employees are:");
list.stream().distinct().forEach(System.out::println);
	}

}
