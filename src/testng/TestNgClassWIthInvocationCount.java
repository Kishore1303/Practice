package testng;
import org.testng.annotations.Test;

public class TestNgClassWIthInvocationCount {
	@Test(invocationCount = 2)
	public static void TestCase_01() {
		System.out.println("Test Case 01");
	}
	@Test(invocationCount = 3)
	public static void TestCase_02() {
		System.out.println("Test Case 02");
	}
	@Test(invocationCount = 4)
	public static void TestCase_03() {
		System.out.println("Test Case 03");
	}
	@Test
	public static void TestCase_04() {
		System.out.println("Test Case 04");
	}
}
