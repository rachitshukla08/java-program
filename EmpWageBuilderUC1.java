/**
 * To Check Whether Employee Is Present Or Absent(UC1)
 */

/**
 * @author Rachit
 *
 */

public class EmpWageBuilderUC1 {

	public static void main(String[] args) {
		
		int isPresent = 1; 									// variable to check presence of an employee
		double random = Math.floor(Math.random() * 10) % 2; // random variable to compare against isPresent
		//variables
		
		if (random == isPresent) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");
		}

	}

}
