
 @browser

  Feature: US0001 Sisteme uye girisi

    Scenario: Kullanici bilgileri girilerek uye olunur

      Given Kullanici driver kurulumlari yaparak cihaz baglantisini kurar
      Given Hesabim alanina tiklanir ve daha sonra uye olmak icin uye ol butonuna tiklanir.
      Given Ad ve soyad bilglieri girisi yapilir.
      Then Mail adresi alanina "E-posta" bilgisi girilir.
      And Sifre alanlarina "Parola" ve tekrar sifreyi dogrulamak icin "Parola" girilir.
      When Sisteme girişin yapılmasi icin uye ol butonina tiklanir.
