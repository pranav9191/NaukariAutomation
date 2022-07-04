package AUTOMATIONPKG;

import org.testng.TestNG;

public class AutoRunner {
	
	static TestNG testng;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testng = new TestNG();
		
		testng.setTestClasses(new Class[] {NaukariUpdate.class});
		
		testng.run();
		
	}
	
}
