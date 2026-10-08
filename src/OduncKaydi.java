import java.util.Date;

public class OduncKaydi {
    private String kayitId;
    private Kullanici kullanici;
    private KitapKopyasi kitapKopyasi;
    private Date oduncTarihi;

    public OduncKaydi(String kayitId, Kullanici kullanici, KitapKopyasi kitapKopyasi) {
        this.kayitId = kayitId;
        this.kullanici = kullanici;
        this.kitapKopyasi = kitapKopyasi;
        this.oduncTarihi = new Date();
    }

    public void oduncOzetiniYazdir() {
        System.out.println("--- ÖDÜNÇ KAYDI ---");
        System.out.println(kullanici.getKullaniciBilgisi());
        System.out.println("Ödünç Alınan Kitap: " + kitapKopyasi.getKitap().getBaslik() + " (Kopya ID: " + kitapKopyasi.getKopyaId() + ")");
        System.out.println("Tarih: " + oduncTarihi);
    }
}
