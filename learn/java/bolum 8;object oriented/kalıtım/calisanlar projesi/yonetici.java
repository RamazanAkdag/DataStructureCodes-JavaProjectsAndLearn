public class yonetici extends calisan{
    public int sourmluKisi;
    public yonetici(String isim, String departman, double maas, int senelik_zam,int sorumluKisi){
        super(isim, departman, maas, senelik_zam);
        this.sourmluKisi = sorumluKisi;
    }
    public int getSourmluKisi() {
        return sourmluKisi;
    }
    public void setSourmluKisi(int sourmluKisi) {
        this.sourmluKisi = sourmluKisi;
    }
}