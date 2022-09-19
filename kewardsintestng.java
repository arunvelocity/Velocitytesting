package MAYBATCH.AMAZON;

import org.testng.Assert;
import org.testng.annotations.Test;

public class kewardsintestng {
	
	@Test(priority=1,invocationCount=4)
	public void Groundfloor ()
	{
		System.out.println("ground floor");
	}
	
	@Test(priority=2)
	public void Firstfloor ()
	{
		System.out.println("ground floor");
//		Assert.fail();
		
	}
	@Test(priority=3,dependsOnMethods= {"Firstfloor"})
	public void Secondfloor ()
	{
		System.out.println("ground floor");
		
	}
}
