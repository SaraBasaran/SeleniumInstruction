package tests;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertTrue;

public class FileExistTest {

    /*
    Given
        Create a file on desktop
    When
        Copy the path of file
    Then
        Assert if the file exists
    */
    @Test
    public void isExistTest() {

        String userDir = System.getProperty("user.dir");
        System.out.println("userDir = " + userDir);

        System.out.println(Files.exists(Paths.get("C:\\Users\\BEKİR\\Desktop")));

        //Assert if the file exists
        String userHome = System.getProperty("user.home");//Gives the user folder
        System.out.println("userHome = " + userHome);//C:\Users\TechPro

        boolean isExist = Files.exists(Paths.get(userHome + "/Desktop/File.txt"));//Writing the path dynamically, so it will work on other computers.
        System.out.println(Files.exists(Paths.get(userDir + "\\src\\test\\java\\tests\\File.txt")));
        assertTrue(isExist);
    }
}
