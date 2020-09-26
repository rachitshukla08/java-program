package com.capgemini.empwage.uc14;

public interface IComputeEmpWage {
	public void addCompanyEmpWage(String company, int empRatePerHour, int noOfWorkingDays, int maxHoursInMonth);
	public void computeEmpWage();
	public int computeEmpWage(CompanyEmpWage companyEmpWage);
}
