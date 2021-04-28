public class empWageOop {

private final String company;
private final int wagePerHour;
private final int numberOfDays;
private final int maxHoursPerMonth;

	public empWageOop (String company, int wagePerHour, int numberOfDays, int maxHoursPerMonth) {
		this.company = company;
		this.wagePerHour = wagePerHour;
		this.numberOfDays = numberOfDays;
		this.maxHoursPerMonth = maxHoursPerMonth;

}

	public int getEmpAttendance () {

		int attendance = (int) (Math.floor (Math.random () * 10 ) % 3);
		return attendance;

	}

	public int getEmpHours () {

		int empHours = 0;
		switch (getEmpAttendance()) {

			case 1:
				System.out.println ("Employee is Full Time");
				empHours = 8;
				break;
			case 2:
				System.out.println ("Employee is Part Time");
				empHours = 4;
				break;
			default:
				System.out.println ("Employee is Absent");
		}
		return empHours;

	}

	public int wageCalculation () {

		int sum = 0;
		int monthlyWage = 0;
		int day = 0;
		int totalWorkHours =  0;

		while ( day < numberOfDays && totalWorkHours < maxHoursPerMonth ) {

			day++;
			totalWorkHours = totalWorkHours + getEmpHours ();

		}
			monthlyWage = wagePerHour * totalWorkHours;
			System.out.println ("Company Name is " + company + " Total Hours Worked is = " + totalWorkHours + " and Total Monthly Wage = " + monthlyWage);
			return monthlyWage;
	}

	public static void main (String[] args) {

		System.out.println ("Welcome to employee wage builder using OOP");
		empWageOop dmart = new empWageOop ("Dmart", 20, 21, 100);
		empWageOop reliance = new empWageOop ("Reliance", 25, 25, 120);
		dmart.wageCalculation ();
		reliance.wageCalculation ();
	}
}
