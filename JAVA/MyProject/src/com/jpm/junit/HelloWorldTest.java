package com.jpm.junit;

import org.junit.Test;

import junit.framework.Assert;

public class HelloWorldTest {

	@Test
	public void testSayHello()
	{
		HelloWorld hw = new HelloWorld();
		Assert.assertEquals("Hello World", hw.sayHello());
		
}
}