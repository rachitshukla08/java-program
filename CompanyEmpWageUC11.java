/**Ability to manage Employee Wage of multiple companies using API approach
 * 
 */

/**
 * @author Rachit
 *
 */
public class CompanyEmpWageUC11 {
	public final String company;
	public final int empRatePerHour;
	public final int noOfWorkingDays;
	public final int maxHoursInMonth;
	public int totalWage;
	
	public CompanyEmpWageUC11(String company, int empRatePerHour, int noOfWorkingDays, int maxHoursInMonth) {
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
