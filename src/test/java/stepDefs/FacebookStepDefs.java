package stepDefs;

import base.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.FacebookHomePage;

public class FacebookStepDefs {
    WebDriver driver;
    FacebookHomePage facebookHomePage;


    @Given("User launch chrome browser")
    public void user_launch_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        facebookHomePage = new FacebookHomePage(driver);

    }

        @When("^User opens URL \"([^\"]*)\"$")
        public void user_opens_url_something(String url){
        driver.get(url);

}
//        @Then("^User navigates to RegistrationFacePage$")
//        public void user_navigates_to_RegistrationFacePage () {
//        driver.get();
//
//        }
//         @Then("^User navigates to FacebookFacePage$")
//         public void user_navigates_to_facebookfacepage()  {
//        }
         @And("^User enters email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
         public void user_enters_email_as_something_and_password_as_something(String email, String password)  {
        FacebookHomePage.emailBx.sendKeys(email);
        FacebookHomePage.passwordbx.sendKeys(password);
        }
         @And("^User clicks on createnewaccount$")
          public void user_clicks_on_createnewaccount() {
            FacebookHomePage.createBtn.click();

        }

        @And("^User enters credentials firstname as  \"([^\"]*)\" and lastname as \"([^\"]*)\" and phonenumber as \"([^\"]*)\" and newpassword as \"([^\"]*)\"$")
        public void user_enters_credentials_firstname_as_something_and_lastname_as_something_and_phonenumber_as_something_and_newpassword_as_something(String firstname, String lastname, String phonenumber, String newpassword) {
        FacebookHomePage.firstnamebx.sendKeys(firstname);
        FacebookHomePage.lastnamebx.sendKeys(lastname);
        FacebookHomePage.phonenumberbx.sendKeys(phonenumber);
        FacebookHomePage.newpasswordbx.sendKeys(newpassword);

    }

        @When("^User selects January from monthdropdownmenu$")
        public void user_selects_January_from_monthdropdownmenu () {
        facebookHomePage.selectData(FacebookHomePage.monthdropdownmenu, 1);

        }

        @When("^User selects (.+) from daydropdownmenu$")
        public void user_selects_from_daydropdownmenu (Integer int1){
            facebookHomePage.selectData(FacebookHomePage.daydropdownmenu, 4);

        }
        @When("^User selects (.+) from yeardropdownmenu$")
        public void user_selects_from_yeardropdownmenu (Integer int1){
            facebookHomePage.selectData(FacebookHomePage.yeardropdownmenu, 14);

        }
        @When("^User clicks on female$")
        public void user_clicks_on_female () {
        FacebookHomePage.femalebx.click();
        }
        @When("^User completes the signUp by clicking signUpbutton$")
        public void user_completes_the_signUp_by_clicking_signUpbutton () {
        FacebookHomePage.signupbx.click();
        }
    @Then("Close the browser")
    public void close_the_browser() {
        driver.quit();

    }
    }

