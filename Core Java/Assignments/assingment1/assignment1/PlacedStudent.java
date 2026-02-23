//3. PlacedStudent
//o frn
//o studentName
//o distanceCovered
//o companyName
//o designation

class PlaceStudent
{
	int frn;
	String name;
	double distanceCovered;
	String companyName;
	String designation;
	
	PlaceStudent()
	{
		this.frn=101;
		this.name="Yash";
		this.distanceCovered=1.2;
		this.companyName = "google";
		this.designation = "SDE1";
	}
	
	PlaceStudent(int frn,String name,double distanceCovered,String companyName,String designation)
	{
		this.frn=frn;
		this.name=name;
		this.distanceCovered=distanceCovered;
		this.companyName=companyName;
		this.designation=designation;
	}
	void setFrn(int frn)
	{
		this.frn=frn;
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setdistanceCovered(double distanceCovered )
	{
		this.distanceCovered=distanceCovered;
	}
	void setcompanyName(String companyName)
	{
		this.companyName=companyName;
	}
	void setdesignation(String designation)
	{
		this.designation=designation;
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
	String getcompanyName()
	{
		return this.companyName;
	}
	String getdesignation()
	{
		return this.designation;
	}
	void display()
	{
		System.out.println("frn:"+this.frn);
		System.out.println("name:"+this.name);
		System.out.println("distanceCovered:"+this.distanceCovered);
		System.out.println("companyName:"+this.companyName);
		System.out.println("designation:"+this.designation);
	}
}

class Q3
{
	public static void main(String args[])
	{
		PlaceStudent p1 = new PlaceStudent(109,"Uttkarsh",3.2,"Capgemini","Software Developer");
		p1.display();
		p1.setFrn(405);
		p1.setName("Raj");
		p1.setdistanceCovered(6.5);
		p1.setcompanyName("Google");
		p1.setdesignation("TCS");
		System.out.println("frn:"+p1.getFrn());
		System.out.println("Name:"+p1.getName());
		System.out.println("DistanceCovered:"+p1.getdistanceCovered());
		System.out.println("companyName:"+p1.getcompanyName());
		System.out.println("Designation:"+p1.getdesignation());
			

	}


}