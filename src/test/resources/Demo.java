class Demo
{   int a=50;
	public static void test1()
	{
	System.out.println(a);
	}
	int b=100;
	public static void test2()
	{
	System.out.println(b);
	}
	public static void main(String[] args)
	{
	new Demo().test1();
	new Demo().test2();
	System.out.println(new Demo().a);
	System.out.println(new Demo().b);
	}
}