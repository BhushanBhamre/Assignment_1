package com.yash.assignment1;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TestArrayListToMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayListToMap> alist = new ArrayList<ArrayListToMap>();

		alist.add(new ArrayListToMap(1, "Rakesh", 300));
		alist.add(new ArrayListToMap(2, "Pratik", 346));
		alist.add(new ArrayListToMap(3, "Ajay", 60));
		alist.add(new ArrayListToMap(4, "Chinmay", 600));
		alist.add(new ArrayListToMap(5, "Ankush", 2500));
		alist.add(new ArrayListToMap(6, "Bhushan", 300));
		alist.add(new ArrayListToMap(7, "Omkar", 450));
		alist.add(new ArrayListToMap(8, "Juned", 320));
		alist.add(new ArrayListToMap(9, "Kiran", 250));
		alist.add(new ArrayListToMap(10, "Shrikant", 230));
		/*
		 * Map<Integer,String>deptMap=alist.stream().collect(
		 * Collectors.toMap(ArrayListToMap::getItemId,ArrayListToMap::getItemName));
		 * deptMap.forEach((k,v)->System.out.println("DeptId(" + k + ")Name :)" + v));
		 * Set<String>set = alist.stream().map(a->a.itemName)
		 * .collect(Collectors.toSet()); System.out.println(set);
		 */

		Map<Integer, String> dept = alist.stream().collect(Collectors.toMap(i -> i.itemId, i -> i.itemname));
		System.out.println(dept);
		
		
		Set<String> set=alist.stream().map(i->i.itemname).collect(Collectors.toSet());
		System.out.println(set);

	}

}
