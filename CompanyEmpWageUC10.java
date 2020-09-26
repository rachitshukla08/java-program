/**UC10 class company
 * 
 */

/**
 * @author Rachit
 *
 */
public class CompanyEmpWageUC10 {
	public final String company;
	public final int empRatePerHour;
	public final int noOfWorkingDays;
	public final int maxHoursInMonth;
	public int totalWage;
	
	public CompanyEmpWageUC10(String company, int empRatePerHour, int noOfWorkingDays, int maxHoursInMonth) {
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
