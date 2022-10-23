package tests.local;

import com.codeborne.selenide.Condition;
import io.appium.java_client.MobileBy;
import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

@Feature("Экран Getting started")
@Owner("Alexander Shashkin")
public class LocalAndroidWikiAppTest extends LocalTestBase {

    @Test
    @Tag("selenide_android")
    @Story("Проверка элементов экрана Getting started")
    @DisplayName("Проверка элементов на первом экране")
    @AllureId("12329")
    void gettingStartedScreenPageOneTest() {

        $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView"))
                .shouldHave(Condition.text("The Free Encyclopedia\n" +
                "…in over 300 languages"));
        $(MobileBy.id("org.wikipedia.alpha:id/secondaryTextView"))
                .shouldHave(Condition.text("We’ve found the following on your device:"));
        $(MobileBy.id("org.wikipedia.alpha:id/option_label"))
                .shouldHave(Condition.text("1.\t\tEnglish"));
        $(MobileBy.id("org.wikipedia.alpha:id/addLangContainer"))
                .$(MobileBy.className("android.widget.TextView"))
                .shouldHave(Condition.text("ADD OR EDIT LANGUAGES"));
        $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_skip_button"))
                .shouldHave(Condition.text("SKIP"));
        $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"))
                .shouldHave(Condition.text("CONTINUE"));
    }

    @Test
    @Tag("selenide_android")
    @Story("Проверка элементов экрана Getting started")
    @DisplayName("Проверка элементов на втором экране")
    @AllureId("12329")
    void gettingStartedScreenPageTwoTest() {
        $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"))
                .click();
        $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView"))
                .shouldHave(Condition.text("New ways to explore"));
        $(MobileBy.id("org.wikipedia.alpha:id/secondaryTextView"))
                .shouldHave(Condition.text("Dive down the Wikipedia rabbit hole with a constantly " +
                        "updating Explore feed. \n" +
                        "Customize the feed to your interests – whether it’s learning about" +
                        " historical events On this day, or rolling the dice with Random."));
        $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_skip_button"))
                .shouldHave(Condition.text("SKIP"));
        $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"))
                .shouldHave(Condition.text("CONTINUE"));
    }

    @Test
    @Tag("selenide_android")
    @Story("Проверка элементов экрана Getting started")
    @DisplayName("Проверка элементов на третьем экране")
    @AllureId("12329")
    void gettingStartedScreenPageThreeTest() {
        $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"))
                .click();
        $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"))
                .click();
        $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView"))
                .shouldHave(Condition.text("Reading lists with sync"));
        $(MobileBy.id("org.wikipedia.alpha:id/secondaryTextView"))
                .shouldHave(Condition.text("You can make reading lists from articles you want" +
                        " to read later, even when you’re offline. \n" +
                        "Login to your Wikipedia account to sync your reading lists. Join Wikipedia"));
        $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_skip_button"))
                .shouldHave(Condition.text("SKIP"));
        $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"))
                .shouldHave(Condition.text("CONTINUE"));
    }

    @Test
    @Tag("selenide_android")
    @Story("Проверка элементов экрана Getting started")
    @DisplayName("Проверка элементов на четвёртом экране")
    @AllureId("12329")
    void gettingStartedScreenPageFourTest() {
        $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"))
                .click();
        $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"))
                .click();
        $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"))
                .click();
        $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView"))
                .shouldHave(Condition.text("Send anonymous data"));
        $(MobileBy.id("org.wikipedia.alpha:id/secondaryTextView"))
                .shouldHave(Condition.text("Help make the app better by letting us know how you use it." +
                        " Data collected is anonymous. Learn more"));
        $(MobileBy.id("org.wikipedia.alpha:id/switchView"))
                .shouldHave(Condition.text("Send usage data"))
                .shouldHave(Condition.attribute("checked", "true"));
        $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_done_button"))
                .shouldHave(Condition.text("GET STARTED"));
    }
}
