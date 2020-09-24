/**Calculating Employee Wage Using Switch Statement
 * 
 */

/**
 * @author Rachit
 *
 */
public class EmpWageBuilderUC4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int isPartTime = 1;
		final int isFullTime = 2;
		final int empRatePerHour=20;
		int empHrs=0;
		int empWage=0;
		
		int random = (int)Math.floor(Math.random()*10)%3;
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
		empWage = empHrs*empRatePerHour;
		System.out.println("Emp wage:"+empWage);
	}

}
