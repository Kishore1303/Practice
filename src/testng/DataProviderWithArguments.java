package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithArguments {
	@Test(dataProvider = "mobileDataProvider")
	public static void performance(String brand, String rating) {
		System.out.println("Brand : "+brand+" and rating :"+rating);
	}
	
	@DataProvider
	public static Object[][] mobileDataProvider(){
		Object[][] objArr=new Object[4][2];
		
		objArr[0][0]="Iphone";
		objArr[0][1]="Performance 10";
		
		objArr[1][0]="Nokia";
		objArr[1][1]="Performane 6";
		
		objArr[2][0]="Oneplus";
		objArr[2][1]="Performance 9";
		
		objArr[3][0]="Samsung";
		objArr[3][1]="Performance 7";
		
		return objArr;
	}
}