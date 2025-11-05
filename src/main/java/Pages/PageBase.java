package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PageBase {
    private WebDriver driver;


    public PageBase(WebDriver webdriver) {
        this.driver = webdriver;
    }


    public String getText(String locator) {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        return driver.findElement(By.xpath(locator)).getText();
    }

    public void click(String locator) {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath(locator)).click();
    }

    public void fillAndEnter(String locator, String text) {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath(locator)).sendKeys(text);
        driver.findElement(By.xpath(locator)).sendKeys(Keys.RETURN);

    }

    public boolean isDisplayed(String locator) {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        return driver.findElement(By.xpath(locator)).isDisplayed();
    }

    public void sendKeys(String locator, String text) {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath(locator)).sendKeys(text);
    }

    public boolean isPresent(String locator) {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        boolean result=true;
        try {
          List<WebElement> elements= driver.findElements(By.xpath(locator));
          if(elements.isEmpty()){
              result=false;
          }
        }catch(Exception e){
           result = false;
        }
        return result;
    }
}
