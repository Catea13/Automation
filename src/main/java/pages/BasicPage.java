package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasicPage {

    public void clickButton(String text) {
        $(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div/div/div/div/span/a")).click();
        sleep(600);
    }

    public void clickTopHeaderConfigurator(String text) {
        $(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/nav/div/div[3]/div[2]/a/div/span")).click();
sleep(600);
screenshot("Header");
    }

    public void clickImage(String text) {
        $(By.xpath("/html/body/div[1]/div/div[2]/div/div[4]/div[1]/div[2]/div/ul/li[1]/div/a/img")).click();
sleep(600);
    }

    public void clickCarauselConfigurator(String text) {
        $(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/a[1]/span[1]")).click();
        sleep(200);
    }
    public void contentText(String text){
        $(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div/div/span")).shouldBe(Condition.visible);
    }
    public void clickonPokiticaDEConfidentialitate(String text){
        $(By.xpath("/html/body/div[2]/div[2]/div/div/div/ul/li[4]/a")).click();
        sleep(1600);
    }
}

