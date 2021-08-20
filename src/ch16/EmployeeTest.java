package ch16;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		/*
		 * static 변수는 객체간 공유된다.
		 */
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		
		/*
		 * The static method getSerialNum() from the type Employee should be accessed in a static way
		 * System.out.println(employeeLee.getSerialNum());
		 */
		System.out.println(Employee.getSerialNum());
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
		
		System.out.println(employeeLee.getEmployeeName()+"님의 사번은 "+employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName()+"님의 사번은 "+employeeKim.getEmployeeId());
		
	}
	
}
