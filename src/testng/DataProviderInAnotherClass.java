package testng;

import org.testng.annotations.Test;

public class DataProviderInAnotherClass {
	@Test(dataProvider = "iplData", dataProviderClass = DataProviderClass.class)
	public static void ipl(String teamName, String points) {
		System.out.println("Team Name : "+teamName+" Points : "+points);
	}
}
