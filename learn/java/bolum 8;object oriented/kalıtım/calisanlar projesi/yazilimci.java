public class yazilimci extends calisan{
    private String bildigidiller;

    public yazilimci(String isim, String departman, double maas, int senelik_zam,String bildigidiller){
        super(isim,departman,maas,senelik_zam);
        this.bildigidiller = bildigidiller;
    }
    public String getYazilimBolum() {
        return yazilimBolum;
    }
    public void setYazilimBolum(String yazilimBolum) {
        this.yazilimBolum = yazilimBolum;
    }
}