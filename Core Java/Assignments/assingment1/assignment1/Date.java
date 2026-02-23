
class Date
{
	int day,month,year;
	String dow;
	
	Date()
	{
		this.day=12;
		this.month=10;
		this.year=2025;
		this.dow="Friday";
	}
	Date(int day,int month,int year,String dow)
	{
		this.day=day;
		this.month=month;
		this.year=year;
		this.dow=dow;
	}
	void setDay(int day)
	{
		this.day=day;
	}
	void setMonth(int month)
	{
		this.month=month;
	}
	void setYear(int year)
	{
		this.year=year;
	}
	void setDow(String dow)
	{
		this.dow=dow;
	}
	int getDay()
	{
		return this.day;
	}
	int getMonth()
	{
		return this.month;
	}
	int getYear()
	{
		return this.year;
	}
	String getDow()
	{
		return this.dow;
	}
	
	void display()
	{
		System.out.println("Day:"+this.day);
		System.out.println("month:"+this.month);
		System.out.println("year:"+this.year);
		System.out.println("Day of Week:"+this.dow);
	}


}





class Q1 {

	public static void main(String[] args)
 	{
		Date d1=new Date(1,12,2026,"Sunday");
		d1.display();
		d1.setDay(10);
		d1.setMonth(12);
		d1.setYear(2026);
		d1.setDow("Monday");
		System.out.println("Day:"+d1.getDay());
		System.out.println("Month:"+d1.getMonth());
		System.out.println("Year:"+d1.getYear());
		System.out.println("Day of Week:"+d1.getDow());
		
	}

}
