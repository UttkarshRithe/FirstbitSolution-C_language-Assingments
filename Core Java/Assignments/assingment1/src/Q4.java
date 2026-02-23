//5. HR
//o id
//o name
//o salary
//o commission

class HR
{
	int id;
	String name;
	double salary;
	double commission;
	
	HR()
	{
		this.id=1;
		this.name="Yash";
		this.salary=20000.0;
		this.commission=5000;
	}
	
	public HR(int id, String name, double salary, double commission) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.commission = commission;
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

	double getCommission() {
		return commission;
	}

	void setCommission(double commission) {
		this.commission = commission;
	}
	void display()
	{
		System.out.println("id:"+this.id);
		System.out.println("name:"+this.name);
		System.out.println("salary:"+this.salary);
		System.out.println("commission:"+this.commission);
	}

	
}


public class Q4 {

	public static void main(String[] args)
	{
		HR h1=new HR();
		h1.display();
		HR h2=new HR(101,"Uttkasrh",25000,5000);
		h2.display();
	}

}
