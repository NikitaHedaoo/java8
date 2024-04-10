package lambdas;

public class EmployeeImpl implements Employee{
	
	public String getEmployeeType() {
		return "Developer";
	}
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Employee employee = new EmployeeImpl();
		System.out.println(employee.getEmployeeType());
	}
	
}
