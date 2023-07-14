package com.testfinal.features.search;

import com.testfinal.WebHook;
import com.testfinal.entity.UserAccount;
import com.testfinal.tasks.Login;
import com.testfinal.tasks.Registration;
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
    List<UserAccount> accounts = readFile("account_login.txt");
    List<UserAccount> accountsRegister = readFile("account_register.txt");

    public static void main(String[] args) {
        List<UserAccount> accounts = readFile("account_register.txt");
        System.out.println(accounts);
    }


    @Test
    public void when_the_user_login_unsuccessfully() {
        givenThat(anna).wasAbleTo(openTheApplication);
        when(anna).attemptsTo(Login.inputAccount(accounts.get(0)));
        then(anna).should(
                seeThat(the(LoginUI.MESSAGE), containsText("định dạng email không hợp lệ"))
        );
    }

    @Test
    public void when_the_user_login_successfully() {
        givenThat(anna).wasAbleTo(openTheApplication);
        when(anna).attemptsTo(Login.inputAccount(accounts.get(1)));
        then(anna).should(
                seeThat(the(LoginUI.ACCOUNT), isVisible())
        );
    }
    @Test
    public void when_the_user_registration_unsuccessfully() {
        givenThat(anna).wasAbleTo(openTheApplication);
        when(anna).attemptsTo(Registration.inputInfoRegister(accountsRegister.get(0)));
//        then(anna).should(
//                seeThat(the(LoginUI.ACCOUNT), isVisible())
//        );
    }
}