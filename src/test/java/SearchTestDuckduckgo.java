import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchTestDuckduckgo {
    @Test
    void successfulSearchTest() {
        Configuration.holdBrowserOpen = true;
        //Configuration.browser = FIREFOX;
        open("https://duckduckgo.com/");
        $("[name=\"q\"]").setValue("selenide").pressEnter();

    }
}