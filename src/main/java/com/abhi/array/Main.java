package com.abhi.array;

public class Main {

	public static void main(String[] args) {
		
		DataArray empList = new DataArray(6);

		empList.add(new Employee(1, "a", "l", 1000));
		empList.add(new Employee(2, "b", "lcd", 89000));
		empList.add(new Employee(3, "c", "lcvhd", 893450));
		empList.add(new Employee(4, "d", "lcbjd", 890123));
		empList.add(new Employee(5, "e", "lcvfyd", 34500));
		empList.add(new Employee(6, "f", "lfyd", 78500));
		// empList.add(new Employee(7, "g", "lfvjhyd", 783400));

		System.out.println("Before Delete-------------------------");
		empList.display();
		
		empList.delete(new Employee(2, "b", "lcd", 89000));
		empList.delete(new Employee(5, "e", "lcvfyd", 34500));
		
		System.out.println("After Delete-------------------------");
		empList.display();
		
		empList.add(new Employee(2, "b", "lcd", 89000));
		empList.add(new Employee(5, "e", "lcvfyd", 34500));
		
		System.out.println("After re insert-------------------------");
		empList.display();
		
	}

}
