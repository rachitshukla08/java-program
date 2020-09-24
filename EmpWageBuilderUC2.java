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
		int empHrs = 0;
		int empWage=0;
		//variables
		double random = Math.ceil(Math.random()*10)%2;
		
		if(isPresent==random) {
			empHrs = 8;
		}
		else {
			empHrs = 0;
		}
		empWage = empHrs*empRatePerHour;
		System.out.println("Emp Wage: "+empWage);
	}
	

}
