/**Refactor to have list of multiple companies to manage Employee Wage.
 * 
 */
package com.capgemini.empwage.uc12;

import java.util.*;

/**
 * @author Rachit
 *
 */
public class EmpWageBuilderUC12 implements IComputeEmpWageUC12 {
	public static final int isPartTime = 1;
	public static final int isFullTime = 2;

	private int noOfCompany = 0;
	private List<CompanyEmpWageUC12> companyEmpWageList;

	public EmpWageBuilderUC12() {
		companyEmpWageList = new ArrayList<CompanyEmpWageUC12>();
	}

	public void addCompanyEmpWage(String company, int empRatePerHour, int noOfWorkingDays, int maxHoursInMonth) {
		CompanyEmpWageUC12 companyEmpWageObj = new CompanyEmpWageUC12(company, empRatePerHour, noOfWorkingDays,
				maxHoursInMonth);
		companyEmpWageList.add(companyEmpWageObj);

	}

	public void computeEmpWage() {
		for (int i = 0; i < companyEmpWageList.size() ; i++) {
			CompanyEmpWageUC12 companyEmpWageObj = companyEmpWageList.get(i);
			companyEmpWageObj.setTotalWage(this.computeEmpWage(companyEmpWageObj));
			System.out.println(companyEmpWageObj);
		}
	}

	public int computeEmpWage(CompanyEmpWageUC12 companyEmpWage) {
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
			totalEmpHrs += empHrs;
			totalWorkingDays++;
			System.out.println("Day: " + totalWorkingDays + " Hours: " + totalEmpHrs);

		}
		return totalEmpHrs * companyEmpWage.empRatePerHour;

	}
		
	public static void main(String[] args) {
		EmpWageBuilderUC12 empWageBuilder = new EmpWageBuilderUC12();
		empWageBuilder.addCompanyEmpWage("Dmart", 20, 2, 10);
		empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
		empWageBuilder.computeEmpWage();
	}

}
