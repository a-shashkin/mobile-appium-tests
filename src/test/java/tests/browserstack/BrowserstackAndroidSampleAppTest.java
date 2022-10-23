package tests.browserstack;

import io.appium.java_client.MobileBy;
import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Feature("Строка поиска")
@Owner("Alexander Shashkin")
public class BrowserstackAndroidSampleAppTest extends BrowserstackTestBase {
    @Test
    @Tag("selenide_android")
    @Story("Проверка работы строки поиска")
    @DisplayName("Проверка выдачи результатов поиска по запросу BrowserStack")
    @AllureId("12329")
    void searchTest() {
        $(MobileBy.AccessibilityId("Search Wikipedia")).click();
        $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).setValue("BrowserStack");
        $$(MobileBy.id("org.wikipedia.alpha:id/page_list_item_container")).shouldHave(sizeGreaterThan(0));
    }
}
