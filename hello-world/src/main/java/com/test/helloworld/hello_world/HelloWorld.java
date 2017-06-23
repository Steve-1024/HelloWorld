package com.test.helloworld.hello_world;

/**
 * Hello world!
 *
 */
public class HelloWorld 
{
	public static void sayHello()
	{
		try
		{
			System.out.print("This is try!");
			return ;
		}
		finally
		{
			System.out.print("This is finally!");
		}
	}

	public static void main(String[] args)
	{
		sayHello();
	}
}
