public class hayvan{
    private String isim;
    private int bacakSayi;
    private double kilo;
    private String tur;


    public hayvan(String isim,int bacakSayi,double kilo,String tur){
        this.isim = isim;
        this.bacakSayi = bacakSayi;
        this.kilo = kilo;
        this.tur =tur;
}
    public void hiz(double hiz){
        System.out.println("hayvan "+hiz+" km/h hizla kosuyor...");
    }
    public void yemekye(String isim){
        System.out.println(isim+ " yemek yiyor...");
    }


    public String getIsim() {
        return isim;
    }


    public void setIsim(String isim) {
        this.isim = isim;
    }


    public int getBacakSayi() {
        return bacakSayi;
    }


    public void setBacakSayi(int bacakSayi) {
        this.bacakSayi = bacakSayi;
    }


    public double getKilo() {
        return kilo;
    }


    public void setKilo(double kilo) {
        this.kilo = kilo;
    }


    public String getTur() {
        return tur;
    }


    public void setTur(String tur) {
        this.tur = tur;
    }
    
}