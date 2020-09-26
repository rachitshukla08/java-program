/**Store the Daily Wage along with the Total Wage.
 * 
 */
package com.capgemini.empwage.uc13;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Rachit
 *
 */
public class EmpWageBuilder implements IComputeEmpWage {
	public static final int isPartTime = 1;
	public static final int isFullTime = 2;

	private int noOfCompany = 0;
	private List<CompanyEmpWage> companyEmpWageList;

	public EmpWageBuilder() {
		companyEmpWageList = new ArrayList<CompanyEmpWage>();
	}

	public void addCompanyEmpWage(String company, int empRatePerHour, int noOfWorkingDays, int maxHoursInMonth) {
		CompanyEmpWage companyEmpWageObj = new CompanyEmpWage(company, empRatePerHour, noOfWorkingDays,
				maxHoursInMonth);
		companyEmpWageList.add(companyEmpWageObj);

	}

	public void computeEmpWage() {
		for (int i = 0; i < companyEmpWageList.size() ; i++) {
			CompanyEmpWage companyEmpWageObj = companyEmpWageList.get(i);
			companyEmpWageObj.setTotalWage(this.computeEmpWage(companyEmpWageObj));
			System.out.println(companyEmpWageObj+"\n");
		}
	}

	public int computeEmpWage(CompanyEmpWage companyEmpWage) {
		int empHrs = 0;
		int totalWorkingDays = 0;
		int totalEmpHrs = 0;
		
		while (totalWorkingDays < companyEmpWage.noOfWorkingDays && totalEmpHrs <= companyEmpWage.maxHoursInMonth) {
			int random = (int) Math.floor(Math.random() * 10) % 3;
			switch (random) {
			case isPartTime:
				empHrs = 4;
				break;
			case isFullTime:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			int dailyWage = companyEmpWage.empRatePerHour * empHrs;
			(companyEmpWage.dailyWageList).add(dailyWage);
			
			//To add daily wage, I made an integer list in CompanyEmpWage class and used it to store daily wage
			totalEmpHrs += empHrs;
			totalWorkingDays++;
			System.out.println("Day:" + totalWorkingDays + " Hours: " + totalEmpHrs);
			System.out.println("      Dailywage = " +companyEmpWage.dailyWageList.get(totalWorkingDays-1));
			

		}
		return totalEmpHrs * companyEmpWage.empRatePerHour;

	}
		
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Builder");
		EmpWageBuilder empWageBuilder = new EmpWageBuilder();
		empWageBuilder.addCompanyEmpWage("Dmart", 20, 2, 10);
		empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
		empWageBuilder.computeEmpWage();
	}

}