package stepDefination;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HeaderSteps extends CommonFunctions {


    @Given("I'm on Homepage {string}")
    public void i_m_on_homepage(String url) {

        driver.get(url);
    }
    @When("I search for an item {string}")
    public void i_search_for_an_item(String searchitemname) {
        // Write code here that turns the phrase above into concrete actions
        waitForTime(2);
        WebElement Itemname= driver.findElement(By.xpath("//input[@id='sli_search_1']"));
        Itemname.sendKeys(searchitemname);


    }
    @When("I click on search Button\"")
    public void i_click_on_search_button() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//input[@class='SearchButton']")).click();
    }
    @When("I should get relavant Item results {string}")
    public void i_should_get_relavant_item_results(String searchname) {
        // Write code here that turns the phrase above into concrete actions
        String navsearchname = driver.findElement(By.xpath("//div[@class='spell-correct']")).getText();
        Assert.assertEquals(navsearchname,searchname);
    }
    @When("I select the Item  I should be able to redirected to the  Itemdetails page {string}")
    public void i_select_the_item_i_should_be_able_to_redirected_to_the_itemdetails_page(String selname) {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//a[@data-desc='Roman Brown Pleated Maxi Skirt']")).click();
       String selTitle= driver.findElement(By.xpath("//h1[text()='Roman Pleated Maxi Skirt']")).getText();
        Assert.assertEquals(selTitle,selname);


    }
    @Then("I should be able to add Item to the bag using Add to Bag Button\"")
    public void i_should_be_able_to_add_item_to_the_bag_using_add_to_bag_button() {
        // Write code here that turns the phrase above into concrete actions
        waitForTime(2);
        Select s = new Select(driver.findElement(By.xpath("//select[@id='Colour-584043']")));
        s.selectByValue("R75-340");

        //driver.findElement(By.xpath("//a[@class='dk_toggle dk_label InStock']")).isSelected();

       //sizeval.is
        //Select s2 = new Select (driver.findElement(By.xpath("//select[@id='Size-R75-340']")));
        //s2.selectByValue("16");
        driver.findElement(By.xpath("/html/body/section[1]/section[1]/div[1]/div[2]/div[3]/div/section[2]/article/section/div[5]/div[5]/div/div/a")).click();
driver.findElement(By.xpath("/html/body/section[1]/section[1]/div[1]/div[2]/div[3]/div/section[2]/article/section/div[5]/div[5]/div/div/a")).click();
        //s2.selectByValue("16");

       driver.findElement(By.xpath("//a[text()='ADD TO BAG']")).click();

    }

}
