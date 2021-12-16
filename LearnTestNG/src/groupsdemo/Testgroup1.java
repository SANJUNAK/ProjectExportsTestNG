package groupsdemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Testgroup1 {
	@Test(groups= {"smoke"})
	public void Test1() {
	System.out.println("My first Smoke TestCase");

}
	@Test(groups= {"smoke"})
	public void Test2() {
	System.out.println("My Second Smoke TestCase");

}
	@Test(groups= {"functional"})
	public void Test3() {
		System.out.println("My First Functional TestCase");

	}
	@Test(groups= {"regression"})
	public void Test4() {
		System.out.println("My First Regression TestCase");

	}}
	