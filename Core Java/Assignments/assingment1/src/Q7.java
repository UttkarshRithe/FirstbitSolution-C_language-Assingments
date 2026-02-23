//Admin
//o id
//o name
//o salary
//o allowance.

class Admin
{
	int id;
	String name;
	double salary;
	double allowance;

	Admin()
	{
		this.id=1;
		this.name="Yash";
		this.salary=12000;
		this.allowance=5000;
	}
	
	Admin(int id, String name, double salary, double allowance) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.allowance = allowance;
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	double getAllowance() {
		return allowance;
	}

	void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	void display()
	{
		System.out.println("id:"+this.id);
		System.out.println("name:"+this.name);
		System.out.println("salary:"+this.salary);
		System.out.println("Allowance:"+this.allowance);
	}
}

public class Q7 {

	public static void main(String[] args) {
		
		Admin a1 = new Admin();
		a1.display();
		Admin a2=new Admin(101,"Uttkarsh",50000,5000);
		a2.display();
	}

}
