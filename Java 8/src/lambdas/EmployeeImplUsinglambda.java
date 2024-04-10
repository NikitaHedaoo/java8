package lambdas;

public class EmployeeImplUsinglambda{
	
//	public String getEmployeeType() {
//		return "Developer";
//	}
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Employee employeeType =() -> "Developer";
		System.out.println(employeeType.getEmployeeType());
		
		Employee employeeType2 = () -> "Tester";
		System.out.println(employeeType2.getEmployeeType());
	}
	
}
