package tests;

import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Authentication extends utilities.TestBase {

    /*
        username : admin
        pass     : admin
        url      : the-internet.herokuapp.com/basic_auth
        SPECIAL URL FOR AUTHENTICATION:
        GO LINK  : https://username:pass@url
         */

   @Test
    public void authTest(){
       driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
       String successMsg=driver.findElement(By.xpath("//h3")).getText();
       assertEquals("Basic Auth", successMsg);

   }


    @Test
    public void authTest2() {
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

         //Assertion
        String successMessage = driver.findElement(By.xpath("//p")).getText();
        assertEquals("Congratulations! You must have the proper credentials.", successMessage);
    }

}
