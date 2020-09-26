
public class EmpWageBuilderArrayUC10 {

	public static final int isPartTime = 1;
	public static final int isFullTime = 2;

	private int noOfCompany = 0;
	private CompanyEmpWageUC10[] companyEmpWageArray;

	public EmpWageBuilderArrayUC10() {
		companyEmpWageArray = new CompanyEmpWageUC10[5];
	}

	private void addCompanyEmpWage(String company, int empRatePerHour, int noOfWorkingDays, int maxHoursInMonth) {
		companyEmpWageArray[noOfCompany] = new CompanyEmpWageUC10(company, empRatePerHour, noOfWorkingDays,
				maxHoursInMonth);
		noOfCompany++;
	}

	private void computeEmpWage() {
		for (int i = 0; i < noOfCompany; i++) {
			companyEmpWageArray[i].setTotalWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}

	private int computeEmpWage(CompanyEmpWageUC10 companyEmpWage) {
		int empHrs = 0;
		int totalWorkingDays = 0;
		int totalEmpHrs = 0;

		while (totalWorkingDays < companyEmpWage.noOfWorkingDays && totalEmpHrs <= companyEmpWage.maxHoursInMonth) {
			int random = (int) Math.floor(Math.random() * 10) % 3;
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
			totalEmpHrs += empHrs;
			totalWorkingDays++;
			System.out.println("Day: " + totalWorkingDays + " Hours: " + totalEmpHrs);

		}
		return totalEmpHrs * companyEmpWage.empRatePerHour;

	}
		
	public static void main(String[] args) {
		EmpWageBuilderArrayUC10 empWageBuilder = new EmpWageBuilderArrayUC10();
		empWageBuilder.addCompanyEmpWage("Dmart", 20, 2, 10);
		empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
		empWageBuilder.computeEmpWage();
	}

}
