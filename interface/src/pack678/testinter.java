package pack678;

public interface testinter
{
	public static void staticTest()
	{
		System.out.println("static from interface");
	}
	 
	int a = 10;       
	
	void test();
	void get();
	
	default void defaultTest()
	{
		System.out.println("default test from inteface");
	}

}	
