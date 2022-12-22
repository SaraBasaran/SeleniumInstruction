package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertTrue;

public class FileDownloadTest extends utilities.TestBase {

    /*
    Given
    Go to "https://testcenter.techproeducation.com/index.php?page=file-download"
    When
    Download junit-4.13-beta-3.jar file
    Then
    Verify if the file downloaded successfully
     */

    @Test
    public void downLoadTest(){

        driver.get("https://testcenter.techproeducation.com/index.php?page=file-download");

        driver.findElement(By.partialLinkText("junit")).click();

        String userHome= System.getProperty("user.home");
        boolean isDownLoaded= Files.exists(Paths.get(userHome+"/Downloads/79918eb8-6342-42be-99ce-8bafac1805b1.tmp"));

        assertTrue(isDownLoaded);

    }









}
