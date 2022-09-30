package testng;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider
	public static Object[][] iplData(){
		Object[][] objArr=new Object[3][2];
		
		objArr[0][0]="Mumbai";
		objArr[0][1]="14";
		
		objArr[1][0]="RCB";
		objArr[1][1]="16";
		
		objArr[2][0]="CSK";
		objArr[2][1]="10";
		
		return objArr;
	}
}
