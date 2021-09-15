import java.util.ArrayList;

public class EmployeeManagementSystem {
	
	EmployeeDAO employeeDB = EmployeeDAO.getEmployeeDAO();
	private ArrayList<Observer> observers;

	
	public void addEmployee(Employee employee) {
		employeeDB.addEmployee(employee);
		notifyObservers(employee,"add");
	}
	public void removeEmployee(Employee employee) {
		employeeDB.removeEmployee(employee);
		notifyObservers(employee,"remove");
	}
	public void changeEmployeeID(Employee employee,int id) {
		employee.setId(id);
		notifyObservers(employee,id);
	}
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers(Employee employee,String operationType) {
		for (Observer observer : observers) {
			observer.notifyMe(employee,operationType);
		}
	}
	public void notifyObservers(Employee employee,int id) {
		for (Observer observer : observers) {
			observer.notifyMe(employee,id);
		}
	}
	
	
	
	
	
	
	
	
	
	
	private static EmployeeManagementSystem employeeManagementSystem = null;
	
	public static EmployeeManagementSystem getEmployeeManagementSystem() {
		if (employeeManagementSystem == null)
			return new EmployeeManagementSystem();
		else
			return employeeManagementSystem;
	}
	private EmployeeManagementSystem() {
		observers = new ArrayList<Observer>();
	}

}
