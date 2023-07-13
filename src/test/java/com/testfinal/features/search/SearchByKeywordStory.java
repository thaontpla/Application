package com.testfinal.features.search;

import com.testfinal.WebHook;
import com.testfinal.entity.UserAccount;
import com.testfinal.tasks.Login;
import com.testfinal.ui.LoginUI;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.*;

@RunWith(SerenityRunner.class)
public class SearchByKeywordStory extends WebHook {
    List<UserAccount> accounts = readFile("data_test.txt");

    @Test
    public void when_the_user_login_unsuccessfully() {
        givenThat(anna).wasAbleTo(openTheApplication);
        when(anna).attemptsTo(Login.inputAccount(accounts.get(0)));
        then(anna).should(
                seeThat(the(LoginUI.WARNING_MESSAGE), isVisible())
        );
    }
}