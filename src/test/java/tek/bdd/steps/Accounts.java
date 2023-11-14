package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import tek.bdd.pages.AccountsPage;
import tek.bdd.utility.SeleniumUtility;

import java.util.Optional;

public class Accounts extends SeleniumUtility {
    @Given("Click on the Accounts button")
    public void click_on_the_accounts_button() {
        clickOnElement(AccountsPage.AccountsButton);

    }
    @Then("Verify there is {int} rows in the table")
    public void varify_there_is_rows_in_the_table(int expectedRows) {
        int actualRows = getNumberOfRows(AccountsPage.Row);
        Assert.assertEquals("Row validation" , expectedRows , actualRows);
    }

    @When("selected {string}")
    public void change_the_show_per_page_to(String number) {
        enterValue(AccountsPage.showPerpage,number);

    }
    @Then("validate the number of accounts as expected {int}")
    public void validate_the_table_accounts_to_be(int expectedNumber) {
        int actualNumber = getNumberOfRows(AccountsPage.showPerpage);
        Assert.assertEquals("Show per page number validation", actualNumber , expectedNumber);


    }


    @Then("validate validate the show per to be {string}")
    public void validate_validate_the_show_per_to_be(String expectedText) {
        Select selectAccountRow = new Select(getDriver().findElement(AccountsPage.showPerpage));
        WebElement getRowNumber = selectAccountRow.getFirstSelectedOption();
        String defaultRowNumber = getRowNumber.getText();
        Assert.assertEquals("Default row number validation", expectedText ,defaultRowNumber);



    }
    @Then("{int} per page should be visible")
    public void validate_the_number_of_accounts_as_expected_account_numbers(int expectedRowNumber) {
        int actualNumberOfAccountsRow = getNumberOfRows(AccountsPage.Row);
        Assert.assertEquals("Validate Accounts page row",
                expectedRowNumber,
                actualNumberOfAccountsRow);

    }

}
