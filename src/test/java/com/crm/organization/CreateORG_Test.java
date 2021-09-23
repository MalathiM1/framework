package com.crm.organization;

import org.testng.annotations.Test;

public class CreateORG_Test {
	
	@Test(groups="Smoke")
	public void createorganization()
	
	{
		System.out.println("created organization ");
	}
	
	@Test(groups="regression")
	public void modifiedorganization()
	
	{
		System.out.println("modified organization ");
	}
	@Test(groups="regression")
	public void deleteorganization()
	
	{
		System.out.println("deleted organization ");
	}

}
