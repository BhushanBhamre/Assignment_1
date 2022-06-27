package com.yash.assignment1;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.IntStream;
public class AverageMarks {
private static Scanner scanner;
public static void main(String[] args) {
	System.out.println("Enter the marks to calculate avarage");
	scanner = new Scanner(System.in);
	int number = scanner.nextInt();
	int [] arr= new int [number];
	System.out.println("Enter the Marks");
	for (int i=0;i<number;i++) {
		System.out.println("Enter the marks of the subject"+ i + 1 );
		arr[i]=scanner.nextInt();
	}
	IntStream streamOfMarks= Arrays.stream(arr);
	OptionalDouble averageOfMarks = streamOfMarks.average();
	System.out.println("Average of marks:"+ averageOfMarks);
}
}
