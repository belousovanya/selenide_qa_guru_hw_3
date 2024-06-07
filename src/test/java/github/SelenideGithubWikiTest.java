package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideGithubWikiTest {

    @BeforeAll
    static void setUpTests() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com";
    }

    @Test
    void userCanFindJUnit5ExampleOnSoftAssertionsPage() {
//        Откройте страницу Selenide в Github
        open("/selenide/selenide");
//        Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();
//        Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $("#wiki-pages-filter").setValue("SoftAssertions");
//        Откройте страницу SoftAssertions
        $(byText("SoftAssertions")).shouldBe(visible).click();
//        проверьте что внутри есть пример кода для JUnit5
        $("#wiki-body").shouldHave(text("JUnit5"));

    }
}

