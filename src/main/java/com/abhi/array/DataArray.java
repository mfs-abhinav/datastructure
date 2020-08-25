package com.abhi.array;

public class DataArray {
	private Employee[] empArr;
	private int nElem;
	
	public DataArray(int size) {
		empArr = new Employee[size];
		nElem = 0;
	}
	
	// add item
	public void add(Employee obj) {
		int empIndex = search(obj);
		
		if (empIndex == -1) {
			empArr[nElem] = obj;
			nElem++;
		} else {
			System.out.println("Employee alreday exist");
		}
	}
	
	// delete item
	public void delete(Employee obj) {
		int empIndex = search(obj);
		int j;
		if (empIndex == -1) {
			System.out.println("Employee doesn't exist");
		} else {
			nElem--;
			for(j=empIndex; j<nElem; j++) {
				empArr[j] = empArr[j+1];
			}
		}
	}
	
	// search item
	public int search(Employee obj) {
		int j;
		for(j=0; j<nElem; j++) {
			if (empArr[j].empId == obj.getEmpId()) {
				break;
			}
		}
		
		if (j == nElem) {
			return -1;
		} else {
			return j;
		}
	}
	
	// display item
	public void display() {
		for(int j=0; j<nElem; j++) {
			System.out.println(empArr[j]);
		}
	}
}
