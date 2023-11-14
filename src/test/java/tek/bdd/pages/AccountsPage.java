package tek.bdd.pages;

import org.openqa.selenium.By;

public class AccountsPage {
    public final static By AccountsButton = By.xpath("//div[2]/div/div/a[1]");

    public final static By showPerpage = By.xpath("//div[2]/div/div/div[3]/select");

    public final static By Row = By.xpath("//tbody/tr");
}
