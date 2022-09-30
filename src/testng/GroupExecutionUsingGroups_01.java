package testng;

import org.testng.annotations.Test;

public class GroupExecutionUsingGroups_01 {
	@Test(groups = "Adhoc Testing")
	public static void testCase01() {
		System.out.println("Test Case one executed");
	}
	@Test(groups = "Smoke Testing")
	public static void testCase02() {
		System.out.println("Test Case Two executed");
	}
	@Test(groups = "Regression Testing")
	public static void testCase03(){
		System.out.println("Test Case Three executed");
	}
	@Test(groups = "Integration Testing")
	public static void testCase04() {
		System.out.println("Test Case five executed");
	}
}
