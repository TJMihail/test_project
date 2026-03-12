package github;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SearchJUnit5 {
   @Test
    void  JUnit5(){
       Configuration.holdBrowserOpen = true;
       open("https://github.com/selenide/selenide");
       $("[href=\"/selenide/selenide/wiki\"]").click();
       $("[placeholder=\"Find a page or section…\"]").setValue("SoftAssertions").pressEnter();
       $("[href=\"/selenide/selenide/wiki/SoftAssertions\"]").click();
       $$(".heading-element").findBy(text("3. Using JUnit5 extend test class")).shouldBe(visible);
   }

}
