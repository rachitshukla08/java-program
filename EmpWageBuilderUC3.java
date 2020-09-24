/**
 * Add Part Time Employee and Wage
 */

/**
 * @author Rachit
 *
 */
public class EmpWageBuilderUC3 {

	public static void main(String[] args) {
		int isPartTime = 1;
		int isFullTime = 2;
		int empRatePerHour=20;
		//Variables
		int empHrs = 0;
		int empWage = 0;
		//Computation
		
		double random = Math.floor(Math.random()*10)%3;
		//Random variable to check whether employee is part time, full time or absent
		if(random==isPartTime) {
			empHrs=4;
		}
		else if(random==isFullTime) {
			empHrs=8;
		}
		else {
			empHrs=0;
		}
		//Assigning employee hours based on whether employee is part time, full time or absent
		empWage = empHrs*empRatePerHour;
		System.out.println("Emp wage: "+ empWage);
		//Computing and printing employee wage based on number of hours

	}

}
