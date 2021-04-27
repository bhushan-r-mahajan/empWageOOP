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
		int dailyWage = 0;

		for ( int day = 0; day < 20; day++ ) {

			dailyWage = wagePerHour * getEmpHours();
			System.out.println ("Daily Wage = " + dailyWage);
			sum = sum + dailyWage;

		}
			System.out.println ("Total Monthly Wage = " + sum);
			return dailyWage;
	}

	public static void main (String[] args) {

		System.out.println ("Welcome to employee wage builder using OOP");
		wageCalculation ();
	}
}
