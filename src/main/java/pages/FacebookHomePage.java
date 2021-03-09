package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.ElementUtil;

import java.util.List;

public class FacebookHomePage  extends ElementUtil {
    public WebDriver ldriver;
    public FacebookHomePage(WebDriver driver) {  // bu constructor parametreli oldugu icin step defs te obje yazinca parametreliyapicaz ve driver ldriver a esit olacak
        this.ldriver = driver;
        PageFactory.initElements((WebDriver) ldriver, this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='email']")
    public static WebElement emailBx;

    @FindBy(how = How.ID, using = "pass")
    public static WebElement passwordbx;

    @FindBy(how = How.ID, using = "u_0_2")
    public static WebElement createBtn;

    @FindBy(how = How.XPATH, using = "(//*[@class='inputtext _58mg _5dba _2ph-'])[1]")
    public static WebElement firstnamebx;

    @FindBy(how = How.XPATH, using = "//*[@id='u_0_o']")
    public static WebElement lastnamebx;

    @FindBy(how = How.XPATH, using = "//*[@id='u_0_r']")
    public static WebElement phonenumberbx;

    @FindBy(how = How.CSS, using = "#password_step_input")
    public static WebElement newpasswordbx;

    @FindBy(how = How.CSS, using = "#month")
    public static WebElement monthdropdownmenu;

    @FindBy(how = How.XPATH, using = "//*[@id='month']//option[1]")
    public static WebElement monthOptions;

    @FindBy(how = How.CSS, using = "#day")
    public static WebElement daydropdownmenu;

    @FindBy(how = How.XPATH, using = "//*[@id='day']//option[1]")
    public static WebElement dayOptions;

    @FindBy(how = How.CSS, using = "#year")
    public static WebElement yeardropdownmenu;

    @FindBy(how = How.XPATH, using = "//*[@id='year']//option[1]")
    public static WebElement yearOptions;

    @FindBy(how = How.XPATH, using = "//*[text()='Female']")
    public static WebElement femalebx;

    @FindBy(how = How.ID, using = "u_2_s")
    public static WebElement signupbx;

//    @FindBy(how = How.XPATH, using = "")
//    public static WebElement ;
//
//
//    @FindBy (how = How.XPATH, using = "")
//    public static List<WebElement> ;
    //By errormessage = By.xpath("//*[@class='_9ay7']");

    public void clickOn(){
        createBtn.click();
    }
    public void enterCredentials (String firstname, String lastname, String phonenumber, String newPassword){
        //firstnamebx.clear();
        firstnamebx.sendKeys(firstname);
        //lastnamebx.clear();
        lastnamebx.sendKeys(lastname);
        //phonenumberbx.clear();
        phonenumberbx.sendKeys(phonenumber);
        //newpasswordbx.clear();
        newpasswordbx.sendKeys(newPassword);
    }



    public void selectData(WebElement slc, int index){
        Select select= new Select(slc);
        select.selectByIndex(index);
    }






}

    //By errormessage = By.xpath("//*[@class='_9ay7']");





