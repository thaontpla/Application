package com.testfinal.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {
    public static Target EMAIL = Target.the("input email").locatedBy("//div[@id='sign-in-div']/descendant::input[@placeholder='Email']");
    public static Target PASS = Target.the("input pass").locatedBy("//div[@id='sign-in-div']/descendant::input[@placeholder='Password']");
    public static Target DANG_NHAP = Target.the("button dang nhap").locatedBy("//div[@id='sign-in-div']/descendant::button");
}
