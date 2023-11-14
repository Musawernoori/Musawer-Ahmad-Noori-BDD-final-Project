package tek.bdd.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class PlansPage {

    public final static By PLANS_BUTTON = By.xpath("//div[2]/div/div/a[2]");

    public final static By PLANS_SECTION_TITLE = By.xpath("//div[3]/div/div/div/h2");

    public final static By PLAN_TABLE_HEADER_ROW = By.xpath("//div/table/thead/tr/th[2]");

    public static By getTablePlan4RowsData(int row, int column){
        return By.xpath("//table/tbody/tr["+row+"]/td["+column+"+]");
    }
    public final static By table_Row_Locator = By.xpath("//div/table/thead/tr/th[2]");

}
