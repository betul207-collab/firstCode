public class Main {
    public static void main(String[] args) {
        Kitap kitap1 = new Kitap("978-123456", "Nesne Yönelimli Programlama", "Ahmet Yılmaz", 2024, "Mevcut");
        KitapKopyasi kopya1 = new KitapKopyasi("KOPYA-01", kitap1, true);
        Kullanici kullanici1 = new Kullanici("U101", "Ayşe Kaya", "ayse@example.com");
        OduncKaydi kayit1 = new OduncKaydi("REC-001", kullanici1, kopya1);

        kayit1.oduncOzetiniYazdir();
    }
}
