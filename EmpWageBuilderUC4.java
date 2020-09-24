/**Calculating Employee Wage Using Switch Statement
 * 
 */

/**
 * @author Rachit
 *
 */
public class EmpWageBuilderUC4 {

	public static void main(String[] args) {
		
		final int isPartTime = 1;
		final int isFullTime = 2;
		final int empRatePerHour=20;
		//variables
		int empHrs=0;
		int empWage=0;
		//computation
		
		int random = (int)Math.floor(Math.random()*10)%3;
		/*Random variable to check whether employee is part time, full time or absent
		 * and downcasting it's float data type to integer data type to use it in switch case	 
		 */
		switch(random) {
			case isPartTime:
				empHrs=4;
				break;
			case isFullTime:
				empHrs=8;
				break;
			default:
				empHrs=0;
		}
		//Assigning employee hours based on whether employee is part time, full time or absent
		empWage = empHrs*empRatePerHour;
		System.out.println("Emp wage:"+empWage);
		//Computing and printing employee wage based on number of hours
	}

}
