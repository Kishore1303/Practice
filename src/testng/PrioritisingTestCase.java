package testng;

import org.testng.annotations.Test;

public class PrioritisingTestCase {
	@Test(priority = 1)
	public static void testCase_01() {
		System.out.println("Hello");
	}
	@Test(priority = 0)
	public static void testCase_02() {
		System.out.println("Kishore");
	}
	@Test(priority = 0)
	public static void testCase_03() {
		System.out.println("M V");
	}
	@Test
	public static void testCase_04() {
		System.out.println("Home sweet home");
	}
	@Test(priority = -2)
	public static void testCase_05() {
		System.out.println("Good evening");
	}
}
