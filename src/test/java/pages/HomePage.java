package pages;


import actions.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepdefinitions.Hooks;

public class HomePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//div[@class='card-body']/h5[contains(text(),'Elements')]")
    private WebElement elementsCard;

    public void navigateToHomePage(){
        driver.get("https://demoqa.com/");
    }
    public void clickElementsCard() throws InterruptedException {
        Wait.andClick(elementsCard);
    }

}
