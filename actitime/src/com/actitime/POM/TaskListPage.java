package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNew;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomer;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement enterCustomerName;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustomerDescription;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustomer;
	
	@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement bigBangCompany;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomer;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualCustomer;
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement createProjectBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter Project Name' and @class]")
	private WebElement EnterProjectName;
	
	@FindBy(xpath="//div[@class='emptySelection']")
	private WebElement AddProjectDDown;
	
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	private WebElement ProjectDesc;
	
	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement clickProjectBtn;	
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div [@class='title']")
	private WebElement actualProject;
	
	@FindBy(xpath="//div[@class='item createNewTasks']")
	private WebElement createTasks;	
	
	@FindBy(xpath="//div[@class='itemRow cpItemRow ' and text()='HDFC_001']")
	private WebElement addCustomerProjectDown;
	
	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getCreateProjectBtn() {
		return createProjectBtn;
	}

	public WebElement getEnterProjectName() {
		return EnterProjectName;
	}

	public WebElement getAddProjectDDown() {
		return AddProjectDDown;
	}

	public WebElement getProjectDesc() {
		return ProjectDesc;
	}

	public WebElement getClickProjectBtn() {
		return clickProjectBtn;
	}

	public WebElement getCreateTasks() {
		return createTasks;
	}

	public WebElement getAddNew() {
		return addNew;
	}

	public WebElement getNewCustomer() {
		return newCustomer;
	}

	public WebElement getEnterCustomerName() {
		return enterCustomerName;
	}

	public WebElement getEnterCustomerDescription() {
		return enterCustomerDescription;
	}

	public WebElement getSelectCustomer() {
		return selectCustomer;
	}

	public WebElement getBigBangCompany() {
		return bigBangCompany;
	}

	public WebElement getCreateCustomer() {
		return createCustomer;
	}

	public WebElement getActualCustomer() {
		return actualCustomer;
	}
	public WebElement getActualProject() {
		return actualProject;
	}
	public WebElement getAddCustomerProjectDown() {
		return addCustomerProjectDown;
	}

	
}

