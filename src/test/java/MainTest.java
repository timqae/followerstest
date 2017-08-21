import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MainTest {

/*
    public AndroidDriver driver;

    @BeforeMethod
    public void setUpAppium() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus5");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4.4");
        capabilities.setCapability(MobileCapabilityType.APP, "C:\\GitRepo\\Insta\\apk\\com.cap.noris.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }

    @Test
    public void searchTag(){
        driver.findElement(By.id("com.cap.noris:id/mSearchView")).click();
        driver.findElement(By.id("com.cap.noris:id/search_src_text")).sendKeys("Summer");
    }
*/

}
