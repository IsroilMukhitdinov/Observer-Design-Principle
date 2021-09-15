import java.util.ArrayList;

public class EmployeeDAO {
	
	Employee employee1 = new Employee("Noah",73);
	Employee employee2 = new Employee("Ignatius",32);
	Employee employee3 = new Employee("Tessa",25);
	Employee employee4 = new Employee("Alex",40);
	
	private ArrayList<Employee> employees;
	
	private static EmployeeDAO employeeDAO = null;
	
	private EmployeeDAO() {
		employees = new ArrayList<Employee>();
	}
	
	public static EmployeeDAO getEmployeeDAO() {
		if (employeeDAO == null)
			return new EmployeeDAO();
		else 
			return employeeDAO;
	}
	
	public ArrayList<Employee> getEmployees(){
		
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		
		return employees;
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}

}
