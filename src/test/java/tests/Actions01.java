package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;

public class Actions01 extends utilities.TestBase {
    /*
        Given
                Go to "https://the-internet.herokuapp.com/context_menu"
        When
                Right click on the box
        Then
                Verify the alert message is “You selected a context menu”
        And
                Accept the alert
        */

    @Test
    public void rightClickTest() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/context_menu");

        //1.step:Create "actions" object
        Actions actions= new Actions(driver);

        //2.Step: Locate the web element you want to right-click
        WebElement box= driver.findElement(By.id("hot-spot"));

        //3.Step:Use actions object with required method
        actions.contextClick(box).perform();

        //Verification
        String alertText= driver.switchTo().alert().getText();
        assertEquals("You selected a context menu", alertText);

        Thread.sleep(2000);
        driver.switchTo().alert().accept();

    }

}

