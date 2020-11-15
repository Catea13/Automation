package steps;

import com.codeborne.selenide.impl.Waiter;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasicPage;

public class BasicPageDef {
    BasicPage basicPage = new BasicPage();


    @When("Click {string} button")
    public void clickButton(String arg0) {
        basicPage.clickButton(arg0);
    }





    @When("Click {string} button top")
    public void clickButtonTop(String arg0)  {
        basicPage.clickTopHeaderConfigurator(arg0);



            }

    @Then("Click {string}")
    public void click(String arg0) {
        basicPage.clickImage(arg0);
    }

    @When("Click {string}  carausel")
    public void clickCarausel(String arg0) {
        basicPage.clickCarauselConfigurator(arg0);

    }


    @Then("Content {string} visible")
    public void contentVisible(String arg0) {
        basicPage.contentText(arg0);
    }



    @When("User click  on {string} link from the footer")
    public void userClickOnLinkFromTheFooter(String arg0) {
        basicPage.clickonPokiticaDEConfidentialitate(arg0);
    }
}
