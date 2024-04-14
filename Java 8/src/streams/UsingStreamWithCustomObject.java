package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingStreamWithCustomObject {

	public static void main(String[] args) {

	//find Employee with 2nd largest salary
	
	List<Employee> empList= new ArrayList<Employee>();
	empList.add(new Employee(100, "HR","XYZ"));
	empList.add(new Employee(300, "OPS","ABC"));
	empList.add(new Employee(400, "HR", "Emp1"));
	empList.add(new Employee(200, "HR","Emp2"));
	empList.add(new Employee(500, "OPS","Emp3"));
	
	//get all employees in HR dept
	List<Employee> filteredList = empList.stream().filter(obj -> obj.getDepartment().equals("HR")).collect(Collectors.toList());
	System.out.println(filteredList);
	
	//get all employees in HR dept show their names only
	empList.stream().filter(x -> x.getDepartment().equals("HR")).forEach(x -> System.out.println(x.getName()));
	
	//HR -> all emps OPS -> all emps
	
	empList.stream().map(x -> x.getSalary()+100).forEach(System.out::println);
	
	}

}

class Employee{
	public Employee(Integer salary, String department, String name) {
		super();
		this.salary = salary;
		this.department = department;
		this.name =name;
	}
	Integer salary;
	String department;
	String name;
	
	public Integer getSalary() {return salary;}
	public String getDepartment(){return department;}
	public String getName() {return name;}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", department=" + department + "]";
	}
	
	
}
