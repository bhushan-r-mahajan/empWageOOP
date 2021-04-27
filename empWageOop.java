public class empWageOop {

	public static int getEmpAttendance () {

		int attendance = (int) (Math.floor (Math.random () * 10 ) % 3);
		return attendance;

	}

	public static int getEmpHours () {

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

	public static int wageCalculation () {

		int wagePerHour = 20;
		int sum = 0;
		int monthlyWage = 0;
		int day = 0;
		int totalWorkHours =  0;

		while ( day < 20 && totalWorkHours < 100 ) {

			day++;
			totalWorkHours = totalWorkHours + getEmpHours ();

		}
			monthlyWage = wagePerHour * totalWorkHours;
			System.out.println ("Total Hours Worked is = " + totalWorkHours + " and Total Monthly Wage = " + monthlyWage);
			return monthlyWage;
	}

	public static void main (String[] args) {

		System.out.println ("Welcome to employee wage builder using OOP");
		wageCalculation ();
	}
}
