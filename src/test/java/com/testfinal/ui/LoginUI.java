package com.testfinal.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {
    public static Target WARNING_MESSAGE = Target.the("warning message").locatedBy("//div[contains(text(),'định dạng email không hợp lệ')]");
    public static Target EMAIL = Target.the("input email").locatedBy("//div[@id='sign-in-div']/descendant::input[@placeholder='Email']");
    public static Target PASS = Target.the("input pass").locatedBy("//div[@id='sign-in-div']/descendant::input[@placeholder='Password']");
    public static Target DANG_NHAP = Target.the("button dang nhap").locatedBy("//div[@id='sign-in-div']/descendant::button");
    public static Target FORGOT_PASS = Target.the("text forgot password").locatedBy("//div[contains(text(),'Quên mật khẩu')]");
    public static Target TEXT_SOCIAL = Target.the("text option social").locatedBy("//div[contains(text(),'Hoặc đăng " +
            "nhập bằng')]");
    public static Target GOOGLE = Target.the("google icon").locatedBy("//img[@alt='google_sign_in']");
    public static Target FACEBOOK = Target.the("facebook icon").locatedBy("//img[@alt='facebook_sign_in']");
    public static Target GIT = Target.the("git icon").locatedBy("//img[@alt='github_sign_in']");

}
