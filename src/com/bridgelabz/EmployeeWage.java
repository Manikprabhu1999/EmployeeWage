package com.bridgelabz;

public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Constants
		int empWage=0;
		int empHrs;
		int EMP_RATE_PER_HOUR=20;
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		//Computation
double empCheck = Math.floor(Math.random() * 10) % 2;
if (empCheck == IS_FULL_TIME)
	{
	empHrs=16;
	}
	
else
    {
    empHrs=8;
    }
empWage=empHrs*EMP_RATE_PER_HOUR;
System.out.println("emp wage:"+empWage);
	}
}