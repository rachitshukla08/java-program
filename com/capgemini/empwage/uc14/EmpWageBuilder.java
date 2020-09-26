/**Ability to get the Total Wage when queried by Company.
 * 
 */
package com.capgemini.empwage.uc14;

import java.util.*;

/**
 * @author Rachit
 *
 */
public class EmpWageBuilder implements IComputeEmpWage {
	public static final int isPartTime = 1;
	public static final int isFullTime = 2;

	private int noOfCompany = 0;
	private List<CompanyEmpWage> companyEmpWageList;
	private Map<String,Integer> companyToWageMap; 
	//Added map to get Total Wage
	private int totalWage;
	
	public EmpWageBuilder() {
		companyEmpWageList = new ArrayList<CompanyEmpWage>();
		companyToWageMap = new HashMap<String,Integer>();
	}

	public void addCompanyEmpWage(String company, int empRatePerHour, int noOfWorkingDays, int maxHoursInMonth) {
		CompanyEmpWage companyEmpWageObj = new CompanyEmpWage(company, empRatePerHour, noOfWorkingDays,
				maxHoursInMonth);
		companyEmpWageList.add(companyEmpWageObj);
	}

	public void computeEmpWage() {
		
		for (int i = 0; i < companyEmpWageList.size(); i++) {
			CompanyEmpWage companyEmpWageObj = companyEmpWageList.get(i);
			companyEmpWageObj.setTotalWage(this.computeEmpWage(companyEmpWageObj));
			companyToWageMap.put(companyEmpWageObj.getCompany(),companyEmpWageObj.getTotalWage());
			//Added company and total wage to map
			System.out.println("Company: "+companyEmpWageObj.getCompany());
			System.out.println("-------------------------------------");
		}
	}
	public int getTotalWage(String company) {
		return companyToWageMap.get(company);
	}
	//Added this method to return total wage when a company name is entered

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

			// To add daily wage, I made an integer list in CompanyEmpWage class and used it
			// to store daily wage
			totalEmpHrs += empHrs;
			totalWorkingDays++;
			System.out.println("Day:" + totalWorkingDays + " Hours: " + totalEmpHrs);
			System.out.println("      Dailywage = " + companyEmpWage.dailyWageList.get(totalWorkingDays - 1));

		}
		totalWage = totalEmpHrs * companyEmpWage.empRatePerHour;
		return totalWage;

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Builder \n-------------------------------------");
		EmpWageBuilder empWageBuilder = new EmpWageBuilder();
		empWageBuilder.addCompanyEmpWage("Dmart", 20, 2, 10);
		empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
		empWageBuilder.computeEmpWage();
		System.out.println("Total wage for Dmart is: "+empWageBuilder.getTotalWage("Dmart"));
		System.out.println("Total wage for Reliance is: "+empWageBuilder.getTotalWage("Reliance"));
	}

}