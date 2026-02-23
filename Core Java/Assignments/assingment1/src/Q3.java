//Employee
//o id
//o name
//o salary

class Employee
{
	int id;
	String name;
	double salary;
	Employee()
	{
		this.id=1;
		this.name="Yash";
		this.salary=20000.0;
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	void display ()
	{
		System.out.println("Id:"+this.id);
		System.out.println("Name:"+this.name);
		System.out.println("Salary:"+this.salary);
	}
}

public class Q3 {

	public static void main(String[] args) {
		Employee e2=new Employee();
		e2.display();
		Employee e1=new Employee(101,"Uttkarsh",25000.0);
		e1.display();
		
		
	}

}
