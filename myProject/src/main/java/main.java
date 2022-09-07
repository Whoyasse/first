import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.time.Duration;
import java.util.List;


public class main {
    public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\jetbrains\\myProject\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://staffbase.com/jobs/quality-assurance-engineer-2021_1730/apply");
            Thread.sleep(6000);

            WebElement coockie = driver.findElement(By.id("onetrust-accept-btn-handler"));
            coockie.click();

            driver.switchTo().frame("grnhse_iframe");

            driver.findElement(By.id("first_name")).sendKeys("Dmitrii");
            driver.findElement(By.id("last_name")).sendKeys("Tikhonov");
            driver.findElement(By.id("email")).sendKeys("dimitri");
            driver.findElement(By.id("phone")).sendKeys("+4917670574209");

            WebElement att = driver.findElement(By.xpath("//input[@name='file']"));
            att.sendKeys("D:\\MyCv.pdf");
            Thread.sleep(3000);


            driver.findElement(By.id("job_application_answers_attributes_0_text_value")).sendKeys("I have a residence permit");


           driver.findElement(By.xpath("//a[@class=\"select2-choice\"]")).click();

           WebElement yes = driver.findElement(By.xpath("//li[@class='select2-results-dept-0 select2-result select2-result-selectable'] "));
           yes.click();

           driver.findElement(By.id("job_application_answers_attributes_2_text_value")).sendKeys("https://github.com/Whoyasse/");

          WebElement btn = driver.findElement(By.id("submit_app"));
          btn.click();

        } catch (InterruptedException e) {

        }finally {
            //driver.quit();
        }

    }
}
