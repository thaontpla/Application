package com.testfinal.features.login;

import com.testfinal.WebHook;
import com.testfinal.entity.UserAccount;
import com.testfinal.tasks.Login;
import com.testfinal.tasks.Registration;
import com.testfinal.ui.LoginUI;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.*;

@RunWith(SerenityRunner.class)
public class LogInStory extends WebHook {
    List<UserAccount> accounts = readFile("account_login.txt");
    List<UserAccount> accountsRegister = readFile("account_register.txt");
    @Test
    @WithTag("pricelist")
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
    public void when_the_user_registration_unsuccessfully_with_email() {
        givenThat(anna).wasAbleTo(openTheApplication);
        when(anna).attemptsTo(Registration.inputInfoRegister(accountsRegister.get(0)));
        then(anna).should(
                seeThat(the(LoginUI.MESSAGE), containsText("định dạng email không hợp lệ"))
        );
    }
    @Test
    public void when_the_user_registration_unsuccessfully_with_phone() {
        givenThat(anna).wasAbleTo(openTheApplication);
        when(anna).attemptsTo(Registration.inputInfoRegister(accountsRegister.get(1)));
        then(anna).should(
                seeThat(the(LoginUI.MESSAGE), containsText("định dạng số điện thoại không hợp lệ"))
        );
    }

    @Test
    public void when_the_user_registration_successfully() {
        givenThat(anna).wasAbleTo(openTheApplication);
        when(anna).attemptsTo(Registration.inputInfoRegister(accountsRegister.get(2)));
        then(anna).should(
                seeThat(the(LoginUI.MESSAGE), containsText("Đăng ký tài khoản thành công. Một email kích hoạt đã được gửi vào hòm thư của bạn."))
        );
    }
}