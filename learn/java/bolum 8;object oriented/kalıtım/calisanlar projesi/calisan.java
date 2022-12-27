public class calisan{
    private String isim;
    private String departman;
    private double maas;
    private int senelik_zam;

    public void zam_yap(int senelik_zam){
        maas += senelik_zam;
        System.out.println("senelik zam yapildi.Yeni maasi : "+maas+" tl...");
    }
    public void departmanDegis(String yeniDepartman){
        this.departman = yeniDepartman;
        System.out.println("departman degistirildi\nyeni departman "+departman);
    }
    
    public calisan(String isim, String departman, double maas, int senelik_zam) {
        this.isim = isim;
        this.departman = departman;
        this.maas = maas;
        this.senelik_zam = senelik_zam;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public int getSenelik_zam() {
        return senelik_zam;
    }

    public void setSenelik_zam(int senelik_zam) {
        this.senelik_zam = senelik_zam;
    }
    
}