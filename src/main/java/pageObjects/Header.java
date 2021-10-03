package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {

    public Header(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="")
    public WebElement searchtxtFld;
    @FindBy(xpath="")
    public WebElement searchIcon;


    public void entersearchTerm(String searchterm)
    {

        searchtxtFld.sendKeys(searchterm);
    }

    public void chooseSearch()
    {
        searchIcon.click();

    }

}
