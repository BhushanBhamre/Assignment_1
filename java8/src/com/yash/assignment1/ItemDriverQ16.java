package com.yash.assignment1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



public class ItemDriverQ16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<ItemQ16> ilist=new ArrayList<ItemQ16>();
		
		
		/*
		 * int itemId; String itemName; String categoryName; double price ; String
		 * dateOfMmanufacturing; String dateOfExpiring;
		 */
		 
		ilist.add(new ItemQ16(1,"bag","travel",5000,"22/10/2024","22/10/2026"));
		ilist.add(new ItemQ16(2,"pendrive","electronics",2000,"10/01/2022","26/10/2029"));
		ilist.add(new ItemQ16(3,"pen","study",500,"02/10/2022","11/05/2027"));
		ilist.add(new ItemQ16(4,"notebook","study",300,"10/04/2022","16/09/2029"));
		ilist.add(new ItemQ16(5,"table","furniture",8000,"25/10/2022","23/10/2026"));
		ilist.add(new ItemQ16(6,"keyboard","electronics",1500,"08/10/2022","23/10/2025"));
		
		
		
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter category name");
		 String category=sc.next();
		List<ItemQ16> i=ilist.stream().filter(e->e.categoryName.contains(category)).collect(Collectors.toList());
		i.stream().forEach(System.out::println);
		
		/*
		 * for(Item i2:i) { System.out.println(i2.itemName+" "+i2.price); }
		 */


		 System.out.println("Enter item starting char");
		String item=sc.next();
		List<ItemQ16> start=ilist.stream().filter(e->e.itemName.startsWith(item)).collect(Collectors.toList());
		start.stream().forEach(System.out::println);

		 System.out.println("Enter date of manufacturing");

		String dom=sc.next();
		System.out.println("Enter date of expiring");

		String doe=sc.next();
		List<ItemQ16> date1=ilist.stream().filter(e->e.dateOfExpiring.contains(doe)&&e.dateOfManufacturing.contains(dom)).collect(Collectors.toList());
		date1.stream().forEach(System.out::println);

		System.out.println("Enter min price");
		int minPrice=sc.nextInt();
		
		System.out.println("Enter max price");
		int maxPrice=sc.nextInt();
		
		List<ItemQ16> price=ilist.stream().filter(e->e.price >minPrice && e.price<maxPrice).collect(Collectors.toList());
		price.stream().forEach(System.out::println);

	}

}
