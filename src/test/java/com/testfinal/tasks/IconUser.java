package com.testfinal.tasks;

import com.testfinal.ui.LoginUI;
import com.testfinal.ui.TechmasterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IconUser implements Task {
    public static IconUser choose() {
        return instrumented(IconUser.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TechmasterPage.USER_ICON),
                Ensure.that(LoginUI.FORGOT_PASS).text().isEqualTo("Quên mật khẩu"),
                Ensure.that(LoginUI.TEXT_SOCIAL).text().isEqualTo("Hoặc đăng nhập bằng"),
                Ensure.that(LoginUI.GOOGLE).isDisplayed(),
                Ensure.that(LoginUI.FACEBOOK).isDisplayed(),
                Ensure.that(LoginUI.GIT).isDisplayed()
        );
    }
}
