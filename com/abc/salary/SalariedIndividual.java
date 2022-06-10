package com.abc.salary;

public interface SalariedIndividual {
	
	//by default datatype is public abstract
	int getworkingdays(); 
	double getcostperday();
	
	public default double calculate() {
		int noOfDays = this.getworkingdays();
		double costPerDay = this.getcostperday();
		
		double costwithoutTax = noOfDays * costPerDay;
		int professionaltax = 700;
		double costwithTdsDeduct = 0.9 *costwithoutTax;
		return costwithTdsDeduct - professionaltax;
	}


}
