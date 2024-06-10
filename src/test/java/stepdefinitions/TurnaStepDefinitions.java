package stepdefinitions;

import Pages.TurnaPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Driver;
import utils.ReusableMethods;

public class TurnaStepDefinitions {
    AndroidDriver<AndroidElement> driver;

    TurnaPage turnaPage=new TurnaPage();


    @Given("Kullanici driver kurulumlari yaparak cihaz baglantisini kurar")
    public void kullanici_driver_kurulumlari_yaparak_cihaz_baglantisini_kurar() throws InterruptedException {
        Driver.getAndroidDriver();
    }
    @Given("Hesabim alanina tiklanir ve daha sonra uye olmak icin uye ol butonuna tiklanir.")
    public void hesabim_alanina_tiklanir_ve_daha_sonra_uye_olmak_icin_uye_ol_butonuna_tiklanir() throws InterruptedException {
        Thread.sleep(150000);
        turnaPage.hesabim.click();
    }
    @Given("Ad ve soyad bilglieri girisi yapilir.")
    public void ad_ve_soyad_bilglieri_girisi_yapilir() {

    }
    @Then("Mail adresi alanina {string} bilgisi girilir.")
    public void mail_adresi_alanina_bilgisi_girilir(String string) {

    }
    @Then("Sifre alanlarina {string} ve tekrar sifreyi dogrulamak icin {string} girilir.")
    public void sifre_alanlarina_ve_tekrar_sifreyi_dogrulamak_icin_girilir(String string, String string2) {
    }
    @When("Sisteme girişin yapılmasi icin uye ol butonina tiklanir.")
    public void sisteme_girişin_yapılmasi_icin_uye_ol_butonina_tiklanir() {

    }
}
