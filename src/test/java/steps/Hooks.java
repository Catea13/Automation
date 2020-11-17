package steps;

import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.*;
/***  in this class the very first actions will be triggered*/
public class Hooks {
/*** Method openUrl- opened site  */
    @Before
    public void openUrl() {
        open("http://kia-moldova.md/ru/");
    }
}
