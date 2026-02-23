//SalesManager
//o id
//o name
//o salary
//o incentive
//o target

class SalesManager
{
	int id;
	String name;
	double salary;
	double incentive;
	int target;
	
	SalesManager()
	{
		this.id=1;
		this.name="Yash";
		this.salary=50000;
		this.incentive=6000;
		this.target=20;
	}
	
	public SalesManager(int id, String name, double salary, double incentive, int target) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.incentive = incentive;
		this.target = target;
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

	double getIncentive() {
		return incentive;
	}

	void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	int getTarget() {
		return target;
	}

	void setTarget(int target) {
		this.target = target;
	}

	void display()
	{
		System.out.println("id: "+this.id);
		System.out.println("name: "+this.name);
		System.out.println("salary: "+this.salary);
		System.out.println("incentive: "+this.incentive);
		System.out.println("target: "+this.target);
	}
}
public class Q5 {

	public static void main(String[] args) 
	{
		SalesManager s1= new SalesManager();
		s1.display();
		SalesManager s2=new SalesManager(101,"Uttkarsh",200000,20000,40);
		s2.display();
	}

}
