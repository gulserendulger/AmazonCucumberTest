Feature: Amazon Kayit Olma ve Urun Secimi
  Scenario: Amazon
    Given Amazon sayfasinda login butonuna tiklama
    When Login email bilgisini girme
    And Login password bilgisini girme
    When Arama kutucuguna aranacak kelimeyi girme
    And Gelen urunlerden rastgele birini secme
    And Secilen urun sepete eklenir
    Then Eklenen urun silinir