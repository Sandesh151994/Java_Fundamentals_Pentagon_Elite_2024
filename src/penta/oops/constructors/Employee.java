package penta.oops.constructors;

public class Employee {
	
	int emp_id;
	String emp_name;
	double salary;
	 Employee(int emp_id,String emp_name,double salary)
	{
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.salary=salary;	
	}
	Employee(Employee emp)
	{
		
		this.emp_id=emp.emp_id;
		this.emp_name=emp.emp_name;
		this.salary=emp.salary;
	}
	
	void getDetails()
	{
		System.out.println("Emp Id: "+emp_id);
		System.out.println("Emp Name : "+emp_name);
		System.out.println("Emp Salary : "+salary);
	}
	
	
	public static void main(String[] args) {
		
		
		
		Employee emp1=new Employee(12,"Drone Prathap",20000);
		
		emp1.getDetails();
		
		Employee emp2=new Employee(emp1);
		
		System.out.println("After Copy constructor");
		emp2.getDetails();
		
		
		
		

	}

}
