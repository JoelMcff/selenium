package pages;

import actions.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SideBarPage {

    private final WebDriver driver;

    public SideBarPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='element-group'][contains(*,'Elements')]//li[@id='item-0']")
    private WebElement textBoxElement;

    public void clickTextboxSidebar() throws InterruptedException {
        Thread.sleep(5000);
        Wait.andClick(textBoxElement);
    }
}
