/**
 * Calculate Daily Employee Wage
 */

/**
 * @author Rachit
 *
 */
public class EmpWageBuilderUC2 {

	public static void main(String[] args) {
		int isPresent = 1;
		int empRatePerHour = 20;
		//variables
		int empHrs = 0;
		int empWage=0;
		//computation
		double random = Math.ceil(Math.random()*10)%2;
		//random variable to compare against isPresent
		if(isPresent==random) {
			empHrs = 8;
		}
		else {
			empHrs = 0;
		}
		//Assigning employee hours based on whether employee is present or not
		empWage = empHrs*empRatePerHour;
		System.out.println("Emp Wage: "+empWage);
		//Computing and printing employee wage based on number of hours
	}
	

}
