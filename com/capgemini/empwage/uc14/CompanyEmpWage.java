/**Ability to get the Total Wage when queried by Company.
 * 
 */
package com.capgemini.empwage.uc14;
import java.util.*;
/**
 * @author Rachit
 *
 */
public class CompanyEmpWage {
	public final String company;
	public final int empRatePerHour;
	public final int noOfWorkingDays;
	public final int maxHoursInMonth;
	public int totalWage;
	public List<Integer> dailyWageList;

	public CompanyEmpWage(String company, int empRatePerHour, int noOfWorkingDays, int maxHoursInMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.noOfWorkingDays = noOfWorkingDays;
		this.maxHoursInMonth = maxHoursInMonth;
		this.dailyWageList = new ArrayList<Integer>();
	}
	public String getCompany() {
		return company;
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
