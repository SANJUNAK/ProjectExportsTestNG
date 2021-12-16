package groupsdemo;

import org.testng.annotations.Test;

public class TestGroup2 {
	@Test(groups= {"smoke"})
	public void Test5() {
	System.out.println("My Third Smoke TestCase");
	}
	
	@Test(groups= {"regression"})
	public void Test6() {
		System.out.println("My Second Regression TestCase");


}
	@Test(groups= {"functional"})
	public void Test7() {
		System.out.println("My Second Functional TestCase");

	}
	@Test(groups= {"regression"})
	public void Test8() {
		System.out.println("My Third Regression TestCase");
	}}

