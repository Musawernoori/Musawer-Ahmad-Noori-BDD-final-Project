package tek.bdd.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import tek.bdd.pages.PlansPage;
import tek.bdd.utility.SeleniumUtility;

import java.util.List;

public class PlansSteps extends SeleniumUtility {

    @Then("click on Plans")
    public void clickOnPlansButton(){
        clickOnElement(PlansPage.PLANS_BUTTON);
    }

    @Then("validate plans section title as {string}")
    public void validatePlansSectionTitle(String expectedPlansSectionTitle){
        String actualPlansSectionTitle = getElementText(PlansPage.PLANS_SECTION_TITLE);
        Assert.assertEquals("Validate Plans section title ",
                expectedPlansSectionTitle,
                actualPlansSectionTitle);
    }

    @Then("validate plan table headers")
    public void validatePlansTableHeaders(DataTable dataTable){
        List<List<String>> tableHeadersAsList = dataTable.asLists();

        List<WebElement> headerElements = getListOfElements(PlansPage.PLAN_TABLE_HEADER_ROW);

        List<String> expectedHeaders = tableHeadersAsList.get(0);

        for (int i = 0; i < headerElements.size(); i++){
            String actualHeader = headerElements.get(i).getText();
            String expectedHeader = expectedHeaders.get(i);

            Assert.assertEquals("Validate plan table header",
                    expectedHeader,
                    actualHeader);
        }

    }

    @Then("validate {int} row of data is present")
    public void validateDataOf4Rows(int expectedSize){
        int actualSize = getNumberOfRows(PlansPage.table_Row_Locator);
        Assert.assertEquals("Validate number of table rows",
                expectedSize,
                actualSize);



    }

}
