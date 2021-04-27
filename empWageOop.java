public class empWageOop {

	public static int getEmpAttendance () {

		int attendance = (int) (Math.floor (Math.random () * 10 ) % 3);
		System.out.println ("Attendance" + attendance);
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

	public static void main (String[] args) {

		System.out.println ("Welcome to employee wage builder using OOP");
		getEmpHours ();
	}
}
