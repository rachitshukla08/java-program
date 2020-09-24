/**Calculating Wages For A Month Assuming 20 Working Days In A Month
 * 
 */

/**
 * @author Rachit
 *
 */
public class EmpWageBuilderUC5 {

	public static void main(String[] args) {
		final int isPartTime = 1;
		final int isFullTime = 2;
		final int empRatePerHour = 20;
		final int noOfWorkingDays = 20;
		//variables
		int empHrs = 0;
		int empWage = 0;
		int totalWage = 0;
		//computation

		for (int i = 0; i < noOfWorkingDays; i++) {
			int random = (int) Math.floor(Math.random() * 10) % 3;
			//Random variable to check whether employee is part time, full time or absent
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
			empWage = empHrs * empRatePerHour;
			// To calculate employee wage per day
			totalWage += empWage; 
			// Adding all the employee wages per day to calculate employee wage for 1 month
			System.out.println("Emp wage: " + empWage);
			// Print employee wage per day
		}
		System.out.println("Total Wage: " + totalWage);
		//Print total employee wage for 1 month

	}

}
