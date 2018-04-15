package webUtility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.slf4j.Logger;

import java.io.File;
import java.io.IOException;

import static webUtility.BaseTest.getDriver;

public class LogFileMessage {
    private static Logger logger= null;


    public static void takeScreenShot() {
        try {

            String screenshotName = "snapshot_" + System.currentTimeMillis() + ".jpg";
            File screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
            String pathName = System.getProperty("user.dir") + "/src/screenshots/" + screenshotName;
            FileUtils.copyFile(screenshot, new File(pathName));
            System.out.println("SnapshotName -> " + screenshotName);
        } catch (IOException e1) {
            throw new RuntimeException(e1);
        }
    }

    public void error(String info) {
        logger.error(info);
    }


}
