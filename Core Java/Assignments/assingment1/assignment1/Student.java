class Student
{
	int frn;
	String name;
	double distanceCovered;
	
	Student()
	{
		this.frn=101;
		this.name="abc";
		this.distanceCovered=1.2;
	}
	Student(int frn,String name,double distanceCovered)
	{
		this.frn=frn;
		this.name=name;
		this.distanceCovered=distanceCovered;
	}
	
	void setFrn(int frn)
	{
		this.frn=frn;
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setdistanceCovered(double distanceCovered)
	{
		this.distanceCovered=distanceCovered;
	}

	int getFrn()
	{
		return this.frn;
	}
	String getName()
	{
		return this.name;
	}
	double getdistanceCovered()
	{
		return this.distanceCovered;
	}
	void display()
	{
		System.out.println("frn: "+this.frn);
		System.out.println("name: "+this.name);
		System.out.println("DistanceCovered: "+this.distanceCovered+"km");

	}

}
class Q2
{
	public static void main(String[]args)
	{

	Student s1=new Student(101,"Yash",1.2);
	s1.display();
	s1.setFrn(110);
	s1.setName("Raj");
	s1.setdistanceCovered(4.5);
	System.out.println("Frn:"+s1.getFrn());
	System.out.println("Name:"+s1.getName());
	System.out.println("Distanve Covered:"+s1.getdistanceCovered());
	}



}