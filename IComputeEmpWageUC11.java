
public interface IComputeEmpWageUC11 {
	public void addCompanyEmpWage(String company, int empRatePerHour, int noOfWorkingDays, int maxHoursInMonth);
	public void computeEmpWage();
	public int computeEmpWage(CompanyEmpWageUC11 companyEmpWage);
}
