
public class HRDepartment implements Observer {
	
	@Override
	public void notifyMe(Employee employee,String operation) {
		System.out.println("HR Department Has Been Notified");
		if (operation.equalsIgnoreCase("add"))
			System.out.println("new employee[" + employee.getName() + " - " + employee.getId() + "] has been added");
		if (operation.equalsIgnoreCase("remove"))
			System.out.println("an employee[" + employee.getName() + " - " + employee.getId() + "] has been removed");
	}
	
	@Override
	public void notifyMe(Employee employee,int id) {
		System.out.println("an employee id changed from " + employee.getId() + " to " + id);
	}

}
