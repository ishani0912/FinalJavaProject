package com.globalpayex.college.entities;

import com.abc.salary.SalariedIndividual;

public class Professor extends CollegeUser implements SalariedIndividual {
	
	
	String[] subjects;
	double costperday;
	int workdays;
	
	public Professor(String name, char gender, String[] subjects, double costperday, int workdays) {
		super(name,gender);  
		
		this.name = name;
		this.gender = gender;
		this.subjects = subjects;
		this.costperday = costperday;
		this.workdays = workdays;
		
	}

	@Override
	public int getworkingdays() {
		// TODO Auto-generated method stub
		return this.workdays;
	}

	@Override
	public double getcostperday() {
		// TODO Auto-generated method stub
		return this.costperday;
	}
	
	

}
