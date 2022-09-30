package testng;

import org.testng.annotations.Test;

public class ThreadPoolSize {
	@Test(invocationCount = 10, threadPoolSize = 3)
	public static void TestCase() {
		System.out.println("Thread Pool ID = "+Thread.currentThread().getId());
		System.out.println("Thread of java allows a program to operate more efficiently by doing multiple things at same time");
	}
}
