package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class BestcontributorSelenide {

    @Test
    void solntsevShouldBeTheTopContributor() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        // открыть страницу репозитория селенида
        open("https://github.com/selenide/selenide");
        // подвести мышку к первому аватару из блока contributors
        $(".BorderGrid").$(byText("Contributors")).ancestor(".BorderGrid-row")
                .$$("ul li").first().hover();
        // проверка: во всплывающем окне есть текст Andrei Solntsev
        $(".Popover").shouldHave(text("Andrei Solntsev"));



    }
}
