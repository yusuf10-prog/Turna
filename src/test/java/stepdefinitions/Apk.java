package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.ConfigReader;
import utils.Driver;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Apk {
    AndroidDriver<AndroidElement> driver;

    @Given("Kullanici gerekli kurulumlari yaparak istenilen uygulamayi {string} cep telefonuna yukler")
    public void kullanici_gerekli_kurulumlari_yaparak_istenilen_uygulamayi_cep_telefonuna_yukler(String dosyaYolu) throws MalformedURLException {


        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2 API 31");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12.0");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        desiredCapabilities.setCapability("app", dosyaYolu);
        //desiredCapabilities.setCapability(MobileCapabilityType.APP,"/Users/yusuf/IdeaProjects/turna.com/Apps/Turna - Flights and Bus Trips_2.4.5_APKPure.apk");

        driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
}
