package com.actitime.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.POM.EnterTimeTrackPage;
import com.actitime.POM.TaskListPage;
import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
@Listeners(com.actitime.generic.ListenersImplementation.class)
public class CreateCustomer extends BaseClass {
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Reporter.log("CreateCustomer",true);
		FileLib f=new FileLib();
		String CustomerName = f.getExcelData("CreateCustomer",1,1);
		String CustomerDesc = f.getExcelData("CreateCustomer", 1, 2);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.taskList();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNew().click();
		t.getNewCustomer().click();
		t.getEnterCustomerName().sendKeys(CustomerName);
		t.getEnterCustomerDescription().sendKeys(CustomerDesc);
		t.getSelectCustomer().click();
		t.getBigBangCompany().click();
		t.getCreateCustomer().click();
		Thread.sleep(3000);
		String actualCustomer = t.getActualCustomer().getText();
		Assert.assertEquals(actualCustomer, CustomerName);
	}
}
