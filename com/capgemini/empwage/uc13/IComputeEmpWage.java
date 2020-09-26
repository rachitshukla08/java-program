package com.capgemini.empwage.uc13;

public interface IComputeEmpWage {
	public void addCompanyEmpWage(String company, int empRatePerHour, int noOfWorkingDays, int maxHoursInMonth);
	public void computeEmpWage();
	public int computeEmpWage(CompanyEmpWage companyEmpWage);
}
