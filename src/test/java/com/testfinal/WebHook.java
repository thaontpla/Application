package com.testfinal;

import com.testfinal.entity.UserAccount;
import com.testfinal.tasks.OpenTheApplication;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WebHook {
    public Actor anna = Actor.named("Anna");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;


    @Steps
    public OpenTheApplication openTheApplication;

    @Before
    public void annaCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(herBrowser));
    }

    public static List<UserAccount> readFile(String fileName) {
        List<String> lists = new ArrayList<>();
        List<UserAccount> accountList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));) {
            while (true) {
                String s = bufferedReader.readLine();
                if (s == null) {
                    break;
                }
                lists.add(s);
            }
            for (int i = 1; i < lists.size(); i++) {
                String[] parts = lists.get(i).split("\\s+");
                accountList.add(new UserAccount(parts[0], parts[1]));
            }
//            System.out.println(accountList.get(0));
//            System.out.println(accountList.get(0).getName());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return accountList;
    }
}
