package tests;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Actions3 extends utilities.TestBase {
   /* Given
    Go to "https://www.techproeducation.com"
    When
    Scroll down with "PAGE_DOWN" key 3 times
            And
    Scroll down with "ARROW_DOWN" key
            And
    Scroll up with "PAGE_UP" key
            And
    Scroll up with "ARROW_UP" key

    */

    @Test
    public void pageUpAndDown() throws InterruptedException {

        driver.get("https://www.techproeducation.com");
        Actions actions=new Actions(driver);
//        actions.sendKeys(Keys.PAGE_DOWN).perform();
//        Thread.sleep(3000);
//        actions.sendKeys(Keys.PAGE_DOWN).perform();
//        Thread.sleep(3000);
//        actions.sendKeys(Keys.PAGE_DOWN).perform();   //actions.scrollToElement()

        //We can use also method chain

        //build() is recommended to use in method chain to make sue the connection between methods is strong
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

        //Scroll down action
        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_DOWN).perform();

        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_UP).perform();

        actions.sendKeys(Keys.ARROW_UP);









    }















}
