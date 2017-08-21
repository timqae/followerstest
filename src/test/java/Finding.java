import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Finding {

/*    AndroidDriver driver;
    @Test
    public void test() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus5");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4.4");
        capabilities.setCapability(MobileCapabilityType.APP, "C:\\GitRepo\\Insta\\apk\\com.cap.noris.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        List<WebElement> buttons = driver.findElementsByClassName("android.widget.LinearLayout");
        System.out.println("available : "+ buttons.size());

        for(int i=0; i<buttons.size(); i++){
            System.out.println(buttons.get(i).getText());
        }

    }*/
}


