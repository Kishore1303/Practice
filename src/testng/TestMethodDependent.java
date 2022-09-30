package testng;

import org.testng.annotations.Test;

public class TestMethodDependent {
	@Test(dependsOnMethods = "india", priority = -1)
	public static void rcb() {
		System.out.println("I am fan of rcb");
	}
	@Test
	public static void mi() {
		System.out.println("I am fan of MI");
	}
	@Test(dependsOnMethods = "mi")
	public static void csk() {
		System.out.println("I like dhoni");
	}
	@Test
	public static void india() {
		System.out.println("I love indian team");
	}
}
