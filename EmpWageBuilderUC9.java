/**Using objects to save the Total Wage for Each Company
 * 
 */

/**
 * @author Rachit
 *
 */
public class EmpWageBuilderUC9 {

	public static final int isPartTime = 1;
	public static final int isFullTime = 2;

	private final String company;
	private final int empRatePerHour;
	private final int noOfWorkingDays;
	private final int maxHoursInMonth;
	private int totalWage;

	public EmpWageBuilderUC9(String company, int empRatePerHour, int noOfWorkingDays, int maxHoursInMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.noOfWorkingDays = noOfWorkingDays;
		this.maxHoursInMonth = maxHoursInMonth;
	}

	public void computeEmpWage() {
		int empHrs = 0;
		int totalWorkingDays = 0;

		int totalEmpHrs = 0;
		// Computation
		while (totalWorkingDays < noOfWorkingDays && totalEmpHrs <= maxHoursInMonth)
		// Running the loop until total working days cross number of working days or
		// total hours cross max working hours
		{
			int random = (int) Math.floor(Math.random() * 10) % 3;
			// Random variable to check whether employee is part time, full time or absent
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
			// Assigning employee hours based on whether employee is part time, full time or
			// absent
			totalEmpHrs += empHrs;
			// Computing total employee hours by adding hours worked per day
			totalWorkingDays++;
			// Incrementing total working days by 1 to compute hours for next day
			System.out.println("Day: " + totalWorkingDays + " Hours: " + totalEmpHrs);
			// Printing the day and cumulative hours till that day

		}
		totalWage = totalEmpHrs * empRatePerHour;
	}

	public String toString() {
		return "Total emp wage for company " + company + " is : " + totalWage;
	}

	public static void main(String[] args) {
		EmpWageBuilderUC9 dMart = new EmpWageBuilderUC9("Dmart", 20, 2, 10);
		EmpWageBuilderUC9 reliance = new EmpWageBuilderUC9("Reliance", 10, 4, 20);
		dMart.computeEmpWage();
		System.out.println(dMart);
		reliance.computeEmpWage();
		System.out.println(reliance);
		
	}

}
