package com.yash.assignment1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;


public class EmployeeDQ17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<EmployeeQ17> list=new ArrayList<EmployeeQ17>();
		list.add(new EmployeeQ17("pratik",LocalDate.of(2000, 07, 23),LocalDate.of(2015, 04, 19),LocalDate.of(2040, 11, 23),"indore","development",25000));
		list.add(new EmployeeQ17("ajay",LocalDate.of(2000, 10, 05),LocalDate.of(2010, 06, 18),LocalDate.of(2030, 07, 23),"mumbai","testing",27000));
		list.add(new EmployeeQ17("ankush",LocalDate.of(2001, 05, 15),LocalDate.of(2014, 07, 15),LocalDate.of(2040, 07, 23),"banglore","development",28000));
		
		System.out.println("Employee in particular department");
		
		Map<String, List<EmployeeQ17>> empByDept=list.stream().collect(Collectors.groupingBy(EmployeeQ17::getDepartment));
		
		 Set<Entry<String, List<EmployeeQ17>>> entrySet = empByDept.entrySet();         
         for (Entry<String, List<EmployeeQ17>> entry : entrySet) 
         {
             System.out.println("--------------------------------------");
             System.out.println("Employees In "+entry.getKey() + " : ");                            
             System.out.println("--------------------------------------");                           
             List<EmployeeQ17> list1 = entry.getValue();        
             for (EmployeeQ17 e : list1) 
             {
                 System.out.println(e.getEmpName());
             }
         }

		
		
		
		System.out.println("Highest salary --");
       Map<String, Optional<EmployeeQ17>> maxSalary=list.stream().collect(Collectors.groupingBy(EmployeeQ17::getDepartment,Collectors.maxBy(Comparator.comparingDouble(EmployeeQ17::getSalary))));
      maxSalary.entrySet().forEach(System.out::println);



        System.out.println("Lowest Salary--");
        Map<String, Optional<EmployeeQ17>> minSalary=list.stream()
                .collect(Collectors.groupingBy(EmployeeQ17::getDepartment,Collectors.minBy(Comparator.comparingDouble(EmployeeQ17::getSalary))));
        minSalary.entrySet().forEach(System.out::println);
        
        System.out.println("Average salary of each department--");
        Map<String, Double> avgSalaryOfDepartments=
        list.stream().collect(Collectors.groupingBy(EmployeeQ17::getDepartment, Collectors.averagingDouble(EmployeeQ17::getSalary)));       
        Set<Entry<String, Double>> entrySet1 = avgSalaryOfDepartments.entrySet();       
        for (Entry<String, Double> entry : entrySet1) 
        {
             System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        
        
        System.out.println("............................................................");
        System.out.println(" Number of employee in each department");
        Map<String, Long>noofemployee=
                list.stream().collect(Collectors.groupingBy(EmployeeQ17::getDepartment,Collectors.counting()));
        System.out.println(noofemployee);





	}

}
