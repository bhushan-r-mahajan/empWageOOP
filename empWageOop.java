public class empWageOop {

	public static int getEmpAttendance () {

		int attendance = (int) (Math.floor(Math.random () * 10 ) % 3);
		System.out.println("Attendance" + attendance);
		return attendance;

	}

	public static void main (String[] args) {

		System.out.println("Welcome to employee wage builder using OOP");
		getEmpAttendance();
	}
}
