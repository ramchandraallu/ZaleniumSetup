package steps;

import com.ea.framework.base.CurrentPageContext;
import com.ea.framework.base.DriverContext;
import com.ea.framework.utilities.CucumberUtil;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.CreateEmployeePage;
import pages.EmployeeListPage;
import pages.HomePage;

/**
 * Created by Karthik-pc on 21/4/2018.
 */
public class EmployeeSteps  {
    @And("^I click employeeList link$")
    public void iClickEmployeeListLink() throws Throwable {
        CurrentPageContext.setCurrentPage(CurrentPageContext.getCurrentPage().As(HomePage.class).ClickEmployeeList());
        DriverContext.WaitForPageToLoad();
    }


    @Then("^I click createnew button$")
    public void iClickCreatenewButton() throws Throwable {
        CurrentPageContext.setCurrentPage(CurrentPageContext.getCurrentPage().As(EmployeeListPage.class).ClickCreateNew());
        DriverContext.WaitForPageToLoad();
    }

    @And("^I enter following details$")
    public void iEnterFollowingDetails(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);

        CurrentPageContext.getCurrentPage().As(CreateEmployeePage.class).CreateEmployee(CucumberUtil.GetCellValueWithRowIndex("Name",2), CucumberUtil.GetCellValueWithRowIndex("Salary",2),
                CucumberUtil.GetCellValueWithRowIndex("DurationWorked",2), CucumberUtil.GetCellValueWithRowIndex("Grade",2), CucumberUtil.GetCellValueWithRowIndex("Email",2));
    }

    @And("^I click create button$")
    public void iClickCreateButton() throws Throwable {
        CurrentPageContext.getCurrentPage().As(CreateEmployeePage.class).ClickCreateButton();
    }

}
