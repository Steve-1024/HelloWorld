package com.test.helloworld.hello_world;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;


/**
 * 
 * @author Steve
 *
 */
@SuppressWarnings("deprecation")
public class HelloWorldTest 
{
	HelloWorld hello = new HelloWorld();
	
	@Before
	public void setup()
	{
		
	}
	
	@Test
	public void helloWorldTest()
	{
//		String result = hello.sayHello();
//		Assert.assertEquals("Hello World!", result);
	}
}
