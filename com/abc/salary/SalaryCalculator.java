package com.abc.salary;
@Deprecated
public class SalaryCalculator {
	
	public static double calculate(SalariedIndividual salariedindivual) {
		int noOfDays = salariedindivual.getworkingdays();
		double costPerDay = salariedindivual.getcostperday();
		
		double costwithoutTax = noOfDays * costPerDay;
		int professionaltax = 700;
		double costwithTdsDeduct = 0.9 *costwithoutTax;
		return costwithTdsDeduct - professionaltax;
	}

}
