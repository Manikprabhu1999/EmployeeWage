package com.bridgelabz;

public class EmployeeWage {

public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Constants
	    int empHrs;
	    int empWage=0;
		int IS_FULL_TIME=1;
		int EMP_RATE_PER_HOUR=20;
		//Computation
double empCheck = Math.floor(Math.random() * 10) % 2;
if (empCheck == IS_FULL_TIME)
	empHrs=8;
	//System.out.println("Employee is present");
else
	//System.out.println("Employee is Absent");
	empHrs=0;
empWage=empHrs*EMP_RATE_PER_HOUR;
System.out.println("emp wage:"+empWage);

	}
}