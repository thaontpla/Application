package com.testfinal.features.search;

import com.testfinal.WebHook;
import com.testfinal.entity.UserAccount;
import com.testfinal.tasks.Login;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.testfinal.tasks.OpenTheApplication;
import com.testfinal.tasks.Search;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

@RunWith(SerenityRunner.class)
public class SearchByKeywordStory extends WebHook {

    @Test
    public void search_results_should_show_the_search_term_in_the_title() {
        UserAccount userAccount = new UserAccount();
        List<UserAccount> userAccounts = new ArrayList<>();
        userAccounts.add(userAccount);

        givenThat(anna).wasAbleTo(openTheApplication);
        when(anna).attemptsTo(Login.inputAccount());

        then(anna).should(eventually(seeThat(TheWebPage.title(), containsString("BDD In Action"))));

    }
}