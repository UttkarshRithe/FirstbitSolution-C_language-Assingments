class A
{
	public static void main(String args[])
	{
		System.out.println("Hello");
	}

}

class B
{
	public static void main(String args[])
	{
		System.out.println("Hi");
		main();
		
	}

	static void main()
	{
		System.out.println("java");
	}
	

}
