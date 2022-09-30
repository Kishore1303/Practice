package testng;

import org.testng.annotations.Test;

public class TestMethodStoppingFromTheExecutionTest {
	@Test()
	public static void mi() {
		System.out.println("I like MI");
	}
	@Test
	public static void rcb() {
		System.out.println("I fan of rcb");
	}
	@Test(priority = 0)
	public static void india() {
		System.out.println("I love india");
	}
	@Test(enabled = false)
	public static void csk() {
		System.out.println("I like Dhoni");
	}
}
