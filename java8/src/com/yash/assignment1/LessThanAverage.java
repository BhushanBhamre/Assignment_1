package com.yash.assignment1;
import java.util.ArrayList;
import java.util.List;
public class LessThanAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Item> ilist = new ArrayList<Item>();
		ilist.add(new Item(1,"Shirt",2000));
		ilist.add(new Item(2,"T-Shirt",1500));
		ilist.add(new Item(3,"Formal Shirt",2000));
		ilist.add(new Item(4,"Jeans",2500));
		ilist.add(new Item(5,"cap",500));
		int sum=0;
		for(Item t :ilist) {
			sum +=t.itemprice;
		}
		int avg = sum / ilist.size();
		System.out.println("average price :"+avg);
		ilist.stream().filter((t -> t.itemprice<avg)).forEach(System.out::println);
		System.out.println("_------------------");
		ilist.stream().filter((a -> a.itemprice%2==0)).forEach(System.out::println);
		}

	}


