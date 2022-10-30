package com.bridgelabz;

public class EmployeeWage {

	public static void main(String[] args) {
		
		int EMP_RATE_PER_HOUR=20;
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 0;
		int Full_day_hour =8;
		int empWage =0;
		int empHrs =0;
		
        double empCheck = Math.floor(Math.random() * 10) % 2;
        
        int i=(int)empCheck;
        switch(i)
        {
        case 0:
        	empHrs=8;
        	break;
        case 1:
        	empHrs=16;
        	break;
       
        default:
        	empHrs=0;
        	break;	
        }
        
       empWage=empHrs*EMP_RATE_PER_HOUR;
       System.out.println("emp wage:"+empWage);
       int totalWage=0;
	for (int j=1;j<=20;j++)
	{
		totalWage=empWage+totalWage;
	}
	System.out.println("TOTAL WAGE:"+totalWage);
	
	
	}
	
	
	
}