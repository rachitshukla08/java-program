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
		int empHrs = 0;
		int empWage = 0;
		//Variables
		
		double random = Math.floor(Math.random()*10)%3;
		if(random==isPartTime) {
			empHrs=4;
		}
		else if(random==isFullTime) {
			empHrs=8;
		}
		else {
			empHrs=0;
		}
		empWage = empHrs*empRatePerHour;
		System.out.println("Emp wage: "+ empWage);

	}

}
