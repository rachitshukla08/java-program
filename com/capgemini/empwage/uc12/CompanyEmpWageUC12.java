/**Refactor to have list of multiple companies to manage Employee Wage.
 * 
 */
package com.capgemini.empwage.uc12;

/**
 * @author Rachit
 *
 */
public class CompanyEmpWageUC12 {
	public final String company;
	public final int empRatePerHour;
	public final int noOfWorkingDays;
	public final int maxHoursInMonth;
	public int totalWage;
	
	public CompanyEmpWageUC12(String company, int empRatePerHour, int noOfWorkingDays, int maxHoursInMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.noOfWorkingDays = noOfWorkingDays;
		this.maxHoursInMonth = maxHoursInMonth;
	}

	public int getTotalWage() {
		return totalWage;
	}

	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}
	
	@Override
	public String toString() {
		return "Total emp wage for company " + company + " is : " + totalWage;
	}
}
