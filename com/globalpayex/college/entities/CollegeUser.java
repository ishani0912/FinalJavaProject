package com.globalpayex.college.entities;

public class CollegeUser {
	
	public String name;
	public char gender;
	public CollegeUser(String name, char gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	
	/*
	 CollegeUser()
	 {
	 //this--> Student object, Professor object
	  }
	 */
	
	public String getDetails()
	{
		//this--> student object, professor object, subclass CollegeUser
		
		return String.format("Name: %s\nGender:%s\n", this.name,this.gender);
		//super(); by default, every class extends from the object class. doesnt have a super class.
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Name: %s\nGender:%s\n", this.name,this.gender);
	}
		

}
