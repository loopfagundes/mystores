package frameworks;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotFw {
    public static void viewScreenshot(WebDriver driver, String imageName) {
        TakesScreenshot screen = (TakesScreenshot) driver;
        File screenFile = screen.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenFile, new File("screenshot" + File.separator + imageName + DateTimeFormatterFw.getTime() + ".jpg"));
        } catch (IOException e) {
            System.out.println("Screenshot error");
            e.printStackTrace();
        }
    }
}
