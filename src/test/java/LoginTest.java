// Импорт класса конфигурации Selenide для настройки браузера, таймаутов и т.д.
import com.codeborne.selenide.Configuration;

// Импорт аннотации Test из библиотеки JUnit 5 для пометки метода как тестового
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Browsers.FIREFOX;
import static com.codeborne.selenide.Condition.text;

// Статический импорт метода "$" для поиска элементов на странице (аналог findElement)
import static com.codeborne.selenide.Selenide.$;

// Статический импорт метода "open" для перехода по указанному URL
import static com.codeborne.selenide.Selenide.open;

public class LoginTest {
    /*
        Открыть форму авторизации
        https://qa.guru/cms/system/login
        Ввести адрес электронной почты
        Ввести пароль
        Нажать кнопку "Войти"
        Нажать на кнопку "Личный кабинет"
        Проверить успешную авторизацию
     */


    @Test
    void successfulLoginTest() {
        Configuration.holdBrowserOpen = true;  // Не закрывает браузер
        //Configuration.browser = FIREFOX;
        open("https://school.qa.guru/cms/system/login"); // Переход по ссылке
        $(".login-form"). shouldHave(text("Войти")); // Проверка текста "Войти"
        $("[name=email]").setValue("puzirev.misha@gmail.com"); // Ввод Email в поле логина
        $("[name=password]").setValue("a11rQ++D4").pressEnter(); // Ввод в поле пароля и клик кнопки Enter
        $("li[class='menu-item menu-item-profile']").click(); //  Нажатите на кнопку пульсации, произойдет анимация
        $("[class='submenu-item submenu-item-profile']").click(); // Нажатие на кнопку профиля и переход в личный кабинет

    }

    @Test
    void unsuccessfulLoginTest() {

    }
}