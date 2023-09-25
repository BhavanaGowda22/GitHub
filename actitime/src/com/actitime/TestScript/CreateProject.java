package com.actitime.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.POM.EnterTimeTrackPage;
import com.actitime.POM.TaskListPage;
import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;

public class CreateProject extends BaseClass {
	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("CreateProject",true);
		FileLib f=new FileLib();
		String ProjectName = f.getExcelData("CreateProject",1, 1);
		String ProjectDesc = f.getExcelData("CreateProject", 1, 2);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.taskList();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNew().click();
		t.getCreateProjectBtn().click();
		t.getEnterProjectName().sendKeys(ProjectName);
		t.getProjectDesc().sendKeys(ProjectDesc);
		t.getAddProjectDDown().click();
		Thread.sleep(2000);
		t.getAddCustomerProjectDown().click();
		t.getClickProjectBtn().click();
		Thread.sleep(4000);
		String actualProjectName = t.getActualProject().getText();
		Assert.assertEquals(ProjectName, actualProjectName);
		
	}
}
