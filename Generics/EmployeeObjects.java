import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class Employee {
	 
	   
    int id;
    String name,department;
    Double salary;
	public Employee(int id, String name, String department, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public Employee() {
	
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
}

public class EmployeeObjects {
	 public static void main(String[] args) {
		 
		 
		       Scanner scan = new Scanner(System.in);
		       HashSet<Employee> employees = new HashSet<Employee>();
		       Employee employee = new Employee();

		       int employeeCount = 0;
		       System.out.print("Total Employees : ");
		       employeeCount = Integer.parseInt(scan.nextLine());
		       
		       for(int i = 0; i < employeeCount ; i++)
		       {
		    	   System.out.print("Id : ");
		           int id = scan.nextInt();
		           employee.setId(id);
		           
		           System.out.print("Name : ");
		           String name = scan.next();
		           employee.setName(name);
		           
		           System.out.print("Department : ");
		           String Department = scan.next();
		           employee.setDepartment(Department);
		           
		           System.out.print("Salary : ");
		           Double salary = scan.nextDouble();
		           employee.setSalary(salary);
		           
		           employees.add(employee);
		       }
		       System.out.println("Element Total In Set :"+ employees.size());
		       
		       for(Employee emp: employees)
		       {
		           System.out.println(emp.getId());
		           System.out.println(emp.getName());
		           System.out.println(emp.getDepartment());
		           System.out.println(emp.getSalary());
		       }
	 }
}
