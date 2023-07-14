package com.testfinal.ui;

import net.serenitybdd.screenplay.targets.Target;

public class RegistrationUI {
    public static Target DANG_KI = Target.the("thư button registration").locatedBy("//a[@id='sign-up-tab']");
    public static Target HO_TEN = Target.the("the name registration").locatedBy("//input[@id='sign-up-fullname']");
    public static Target EMAIL = Target.the("the email registration").locatedBy("//input[@id='sign-up-email']");
    public static Target PHONE = Target.the("the phone registration").locatedBy("//input[@id='sign-up-phone']");
    public static Target PASSWORD = Target.the("the password registration").locatedBy("//input[@id='sign-up-password']");
    public static Target RETYPE_PASSWORD = Target.the("the retype password registration").locatedBy("//input[@id='sign-up-retype-password']");
    public static Target DANG_KI_BUTTON = Target.the("the button registration").locatedBy("//button[@id='btn-sign-up']");

}
