package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {
    private static AndroidDriver<AndroidElement> appiumDriver;
    static final String TELEFONADI="PIXEL 2 API 31";
    static final String ANDROIDVERSION="12.0";
    static final String PLATFORM="Android";
    static final String OTOMASYON_ISMI="UiAutomator2";


    public static AndroidDriver getAndroidDriver(){


        URL appiumServerURL=null;
        try {
            appiumServerURL=new URL("http:127.0.0.1:4723/wd/hub");
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        if (appiumDriver == null){
            DesiredCapabilities caps=new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, TELEFONADI);
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, ANDROIDVERSION);
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM);
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, OTOMASYON_ISMI);
            caps.setCapability("appPackage","com.tripenia.turna");
            caps.setCapability("appActivity","com.tripenia.turna.MainActivity");
            caps.setCapability(MobileCapabilityType.NO_RESET,false);

            if (ConfigReader.getProperty("platformName").equals("Android")){
                assert appiumServerURL != null;
                appiumDriver=new AndroidDriver<AndroidElement>(appiumServerURL,caps);
                appiumDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            }else {
                throw new UnsupportedOperationException("Invalid Platform Name ");
            }
        }
        return appiumDriver;
    }
    public static void quitAppiumDriver(){
        if (appiumDriver !=null){
            appiumDriver.closeApp();
            appiumDriver = null;
        }
    }
}
