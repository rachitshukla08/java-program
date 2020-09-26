package com.capgemini.empwage.uc12;

public interface IComputeEmpWageUC12 {
	public void addCompanyEmpWage(String company, int empRatePerHour, int noOfWorkingDays, int maxHoursInMonth);
	public void computeEmpWage();
	public int computeEmpWage(CompanyEmpWageUC12 companyEmpWage);
}
