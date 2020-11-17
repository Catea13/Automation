package steps;

import com.codeborne.selenide.impl.Waiter;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasicPage;
/*** This class contains steps (features)and their methods*/
public class BasicPageDef {
    BasicPage basicPage = new BasicPage();

 /**
     * Click "RO" button
     */
    @When("Click {string} button")
    public void clickButton(String arg0) {
        basicPage.clickButton(arg0);
    }


  /**
     * When Click "Configurator" button top
     */


    @When("Click {string} button top")
    public void clickButtonTop(String arg0)  {
        basicPage.clickTopHeaderConfigurator(arg0);



            }
 /**
     * Click imagine
     */

    @Then("Click {string}")
    public void click(String arg0) {
        basicPage.clickImage(arg0);
    }
  
    @When("Click {string}  carausel")
    public void clickCarausel(String arg0) {
        basicPage.clickCarauselConfigurator(arg0);

    }
  /**
     * Content "АВТОМОБИЛЬ KIA АВТОМОБИЛЬ KIA" visible (Check if the text appar in this page
     */

    @Then("Content {string} visible")
    public void contentVisible(String arg0) {
        basicPage.contentText(arg0);
    }

  /**
     * User click  on "Политика конфиденциальности" link from the footer
     */


    @When("User click  on {string} link from the footer")
    public void userClickOnLinkFromTheFooter(String arg0) {
        basicPage.clickonPokiticaDEConfidentialitate(arg0);
    }
}
