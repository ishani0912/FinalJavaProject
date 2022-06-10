package com.globalpayex.college.entities;

public class Student extends CollegeUser {
	
	
	int roll;
	float marks;
	
	public Student(String name, char gender, int roll, float marks) {
		super(name,gender);			//calls the super class constructor- no argument constructor
		//internal: CollegeUser(name,gender)
		
		
		this.roll = roll;
		this.marks = marks;
	}
	
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		String str1 = super.getDetails();
		super.getDetails();
		//internally: on CollegeUser class, it will use CollegeUser.getDetails()
		return String.format("%sRoll:%s\nMarks:%s\n",str1 ,this.roll,this.marks);
	}
	
	

}
