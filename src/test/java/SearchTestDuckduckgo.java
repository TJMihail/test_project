import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchTestDuckduckgo {

    @Test
    void successfulSearchTest() {
        Configuration.holdBrowserOpen = true;
      // Configuration.browser = Browsers.FIREFOX;
       // Configuration.browser = Browsers.EDGE;
        Selenide.open("https://duckduckgo.com/");
        Selenide.$("[class=\"mr-2 color-fg-muted\"]").setValue("selenide").pressEnter();
    }
}