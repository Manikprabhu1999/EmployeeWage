package com.bridgelabz;

public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Constants
		int IS_FULL_TIME = 1;
		//Computation
double empCheck = Math.floor(Math.random() * 10) % 2;
if (empCheck == IS_FULL_TIME)
	System.out.println("Employee is present");
else
	System.out.println("Employee is Absent");
	}
}