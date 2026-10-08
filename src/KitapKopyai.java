public class KitapKopyasi {
    private String kopyaId;
    private Kitap kitap;
    private boolean oduncAlinabilirMi;

    public KitapKopyasi(String kopyaId, Kitap kitap, boolean oduncAlinabilirMi) {
        this.kopyaId = kopyaId;
        this.kitap = kitap;
        this.oduncAlinabilirMi = oduncAlinabilirMi;
    }

    public String getKopyaId() { return kopyaId; }
    public Kitap getKitap() { return kitap; }
    public boolean isOduncAlinabilirMi() { return oduncAlinabilirMi; }
    public void setOduncAlinabilirMi(boolean oduncAlinabilirMi) { this.oduncAlinabilirMi = oduncAlinabilirMi; }
}
