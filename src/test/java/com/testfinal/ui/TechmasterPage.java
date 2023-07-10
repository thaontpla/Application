package com.testfinal.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://techmaster.vn/")
public class TechmasterPage extends PageObject {
    public static Target USER_ICON = Target.the("icon field").locatedBy("//span[@class ='login']/descendant::i");
}
