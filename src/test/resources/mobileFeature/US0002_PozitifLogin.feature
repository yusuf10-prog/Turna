
  Feature: Turna.com uygulamasında hesap acma islemi yapılır.

    Scenario: TC01 Pozitif login testi

      Given Kullanici driver kurulumlari yaparak cihaz baglantisini kurar
      And Hesabım alanina tiklanir.
      And Mail adresi alanina "E-posta" girilir.
      And Sifre alanina "Parola" bilgisi girilir.
      Then Sisteme girmek için giris butonuna tiklanir.
