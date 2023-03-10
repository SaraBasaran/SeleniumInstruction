package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actions04 extends utilities.TestBase {

    /*
        Given
                Go to "https://jqueryui.com/droppable/"
        When
                Drag the element "Drag me to my target" to "Drop here" element and drop it.
        */

    @Test
    public void dragAndDropTest() throws InterruptedException {
        //Go to "https://jqueryui.com/droppable/"
        driver.get("https://jqueryui.com/droppable/");

        //Since the elements are in  an iFrame we need to switch to iFrame first
        driver.switchTo().frame(0);//This will switch driver to iFrame

        //Drag the element "Drag me to my target" to "Drop here" element and drop it.
        //1. Create Actions object
        Actions actions = new Actions(driver);

        //2. Locate source and target web elements
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        //3. Use dragAndDrop() method with web elements.
        Thread.sleep(2000);
        actions.dragAndDrop(source, target).perform();

    /*
    If you can not find element:
    Look for:
    1. check the locator
    2. wait or synchronization issue
    3. iFrame
    */

    }
    @Test
    public void clickAndHoldTest() throws InterruptedException {
        //Go to "https://jqueryui.com/droppable/"
        driver.get("https://jqueryui.com/droppable/");

        //Since the elements are in  an iFrame we need to switch to iFrame first
        driver.switchTo().frame(0);//This will switch driver to iFrame

        //Drag the element "Drag me to my target" to "Drop here" element and drop it.
        //1. Create Actions object
        Actions actions = new Actions(driver);

        //2. Locate source and target web elements
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        //3. Use clickAndHold() method with web elements.
        Thread.sleep(2000);
        actions.clickAndHold(source).moveToElement(target).build().perform();


    }

    @Test
    public void dragAndDropByTest() throws InterruptedException {
        //Go to "https://jqueryui.com/droppable/"
        driver.get("https://jqueryui.com/droppable/");

        //Since the elements are in  an iFrame we need to switch to iFrame first
        driver.switchTo().frame(0);//This will switch driver to iFrame

        //Drag the element "Drag me to my target" to "Drop here" element and drop it.
        //1. Create Actions object
        Actions actions = new Actions(driver);

        //2. Locate source and target web element's location
        WebElement source = driver.findElement(By.id("draggable"));

        //3. Use dragAndDropBy() method with web elements.
        Thread.sleep(2000);
        actions.dragAndDropBy(source, 160, 40).perform();


    }

    @Test
    public void moveByOffsetTest() throws InterruptedException {
        //Go to "https://jqueryui.com/droppable/"
        driver.get("https://jqueryui.com/droppable/");

        //Since the elements are in  an iFrame we need to switch to iFrame first
        driver.switchTo().frame(0);//This will switch driver to iFrame

        //Drag the element "Drag me to my target" to "Drop here" element and drop it.
        //1. Create Actions object
        Actions actions = new Actions(driver);

        //2. Locate source and target web elements
        WebElement source = driver.findElement(By.id("draggable"));

        //3. Use moveByOffset() method with web elements.
        Thread.sleep(2000);
        actions.clickAndHold(source).moveByOffset(160, 40).perform();

    }






    }
