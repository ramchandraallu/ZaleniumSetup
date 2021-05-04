package steps;

import com.ea.framework.base.Base;

import com.ea.framework.base.CurrentPageContext;
import cucumber.api.DataTable;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;

import java.util.List;

/**
 * Created by Karthik-pc on 12/4/2018.
 */
public class LoginSteps extends Base {

    @And("^I ensure application opened$")
    public void iEnsureApplicationOpened() {
        CurrentPageContext.setCurrentPage(GetInstance(HomePage.class));
        System.out.println(CurrentPageContext.getCurrentPage().As(HomePage.class).IsLogin());
        Assert.assertTrue("The login page is not loaded", CurrentPageContext.getCurrentPage().As(HomePage.class).IsLogin());
       
        System.out.println("app opened");
    }


    @Then("^I click login link$")
    public void iClickLoginLink() {
        //Navigation to Login Page
        CurrentPageContext.setCurrentPage(CurrentPageContext.getCurrentPage().As(HomePage.class).ClickLogin());
    }

    @When("^I enter UserName and Password$")
    public void iEnterUserNameAndPassword(DataTable data) {
        List<List<String>> table = data.raw();
        CurrentPageContext.getCurrentPage().As(LoginPage.class).Login("varapraa","Chandra@02");
    }

    @Then("^I click login button$")
    public void iClickLoginButton() throws InterruptedException {
        //Home Page
        CurrentPageContext.setCurrentPage(CurrentPageContext.getCurrentPage().As(LoginPage.class).ClickLogin());
    }

    @Then("^I should see the username with hello$")
    public void iShouldSeeTheUsernameWithHello() throws Throwable {
        Assert.assertEquals("The user is not admin", "Hello varapraa!", CurrentPageContext.getCurrentPage().As(HomePage.class).GetLoggedInUser());
        System.out.println("login button check"+CurrentPageContext.getCurrentPage().As(HomePage.class).GetLoggedInUser());
    }


}
