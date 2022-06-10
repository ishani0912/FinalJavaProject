package com.globalpayex.college.entities;

public class StudentOld {
	
	//instance attributes
	public String name;
	public char gender;
	int roll;
	float marks;
	
	public static int count; //class object attribute. public access specifier outside the package
	
	public String getDetails()    //internally: even if no parameter is defined, keyword this. (String getDetails(Student this)
	{
		//return ("name:" + this.name + "\n" + "gender:" + this.gender + "\n" + "roll no:"+ this.roll + "\n"+"marks:" + this.marks+"\n");
		
		//String format()
		return String.format("name:%s\nGender:%s\nRollNo:%s\nMarks:%s\n", this.name,this.gender,this.roll,this.marks);
	}
	
	public StudentOld(String name, char gender, int roll, float marks) {                   //parameterized constructor
		this.name= name;
		this.gender = gender;
		this.roll = roll;
		this.marks = marks;
		
		++StudentOld.count;    //convention for static variable
	
	}
	
	//constructor overloading
	
	//this must be the first statement 
	public StudentOld(){
		this("NA", 'm', -1, 0);
	}
	
	public char getgrade() {
		char grade;
		
		if((marks>100) || (marks<0))
		{
			grade = 'I';
		}
		else if(marks>=70) {
			grade='A';
		}
		else if((marks>=60) && (marks<70))
		{
			grade='B';
		}
		else if((marks>=40) && (marks<60))
		{
			grade='C';
		}
		else
		{
			grade='F';
		}
return grade;
	}
	
	public static StudentOld newInstance(String name, char gender, int roll, float marks)
	{
		return new StudentOld(name,gender,roll,marks);
	}

	
}
