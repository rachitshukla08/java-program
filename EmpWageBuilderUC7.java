/**Refactoring the Code to write a Class Method to Compute Employee Wage
 * 
 */

/**
 * @author Rachit
 *
 */
public class EmpWageBuilderUC7 {
	public static final int isPartTime = 1;
	public static final int isFullTime = 2;
	public static final int empRatePerHour = 20;
	public static final int noOfWorkingDays = 20;
	public static final int maxHoursInMonth = 100;

	public static int computeEmpWage() {
		// Variables
		int empHrs = 0;
		int totalWorkingDays = 0;
		int totalWage = 0;
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
		System.out.println("Total Emp Wage: " + totalWage);
		// Calculating and printing total wage for 20days or 100 hours
		return totalWage;

	}

	public static void main(String[] args) {
		 computeEmpWage();
	}

}
