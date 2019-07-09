package ch03;

public class Employeeex {
	public static void main(String[] args) {
		Employee[] emp = new Employee[5];
		
		emp[0] = new SalaryMan("길동", 200000);
		emp[1] = new SalaryMan("수지", 530000);
		emp[2] = new HourlyMan("효린", 10, 30000);
		emp[3] = new HourlyMan("아유", 15, 1000);
		emp[4] = new SalaryMan("명수", 200000);
		
		for(Employee e : emp) {
			e.computeIncentive();
			e.print();
			
			if( e instanceof HourlyMan) {
				((HourlyMan)e).display();
			}
		}
	}
	

}
