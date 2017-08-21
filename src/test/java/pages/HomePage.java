package pages;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomePage {


    public AndroidDriver driver;

    @AndroidFindBy(id = "com.cap.noris:id/mSearchView")
    public AndroidElement searchLens;

    @AndroidFindBy(id = "com.cap.noris:id/search_src_text")
    public  AndroidElement searchField;

    public HomePage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 10, TimeUnit.SECONDS), this);
    }
}
