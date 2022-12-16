package tests;

import com.github.javafaker.Faker;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class JavaFaker {
    WebDriver driver;
    /*
        TEST DATA: username, password, URL, test environment, address etc...
        Where do you get your test data?
        BA-Business Analyst
        Test lead
        Manual Tester
        Developer
        From database
        From API(documentation)
        Mock data(fake data)--> Java Faker
        (Java Faker creates data randomly)
         */
        @Test
        public void javaFakerTest(){
            //1st step: Create Faker object
            Faker faker = new Faker();

            //2nd Step: Create fake data
            //generating firstName
            String firstName = faker.name().firstName();
            System.out.println("firstName = " + firstName);

            //generating lastName
            String lastName = faker.name().lastName();
            System.out.println("lastName = " + lastName);

            //generating username
            String username = faker.name().username();
            System.out.println("username = " + username);

            //generating title
            String title = faker.name().title();
            System.out.println("title = " + title);

            //fullAddress
            String fullAddress = faker.address().fullAddress();
            System.out.println("fullAddress = " + fullAddress);

            //cellPhone
            String cellPhone = faker.phoneNumber().cellPhone();
            System.out.println("cellPhone = " + cellPhone);

            //numberBetween
            int numberBetween = faker.number().numberBetween(1,5);
            System.out.println("numberBetween = " + numberBetween);

        }

    @After
    public void tearDown(){
        driver.quit();
    }

}





