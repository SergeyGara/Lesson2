package com.example;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TestExample {
    @Test
    void successfulSearchTest() {
        open("https://github.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("[href='/selenide/selenide']").click();
        $("#wiki-tab").click();
        $(".markdown-body").shouldHave(text("Soft assertions"));
        $x("(//a[@href='/selenide/selenide/wiki/SoftAssertions'])[2]").click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));
    }
}
