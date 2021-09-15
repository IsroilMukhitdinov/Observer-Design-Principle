
public class Main {
	
	public static void main(String[] args) {
		
		EmployeeManagementSystem ems = EmployeeManagementSystem.getEmployeeManagementSystem();
		PayRollDepartment prd = new PayRollDepartment();
		HRDepartment hrd = new HRDepartment();
		ems.registerObserver(prd);
		ems.registerObserver(hrd);
		
		ems.addEmployee(new Employee("Peter",102));
	}

}
