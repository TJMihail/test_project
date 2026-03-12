package github;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.files.DownloadActions.click;

public class SelenideRepositorySearch {

    @Test
    void shouldFindSelenideRepositoryAtTheTop() {
        Configuration.holdBrowserOpen = true;
        Selenide.open("https://github.com/");
        $("[class=\"mr-2 color-fg-muted\"]").click();;
        $("[name=\"query-builder-test\"]").setValue("Selenide").pressEnter();
        $("[class=\"Link__StyledLink-sc-1syctfj-0 prc-Link-Link-9ZwDx\"]").click();
        $("#repository-container-header").shouldHave(text("selenide / selenide"));


        //sleep(5000);
    }
}




