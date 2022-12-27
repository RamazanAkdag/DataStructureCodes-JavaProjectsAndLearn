public class kopek extends hayvan{
    private int dissayi;

    public kopek(String isim,int bacakSayi,double kilo,String tur,int dissayi){
        super(isim, bacakSayi, kilo, tur);
        this.dissayi = dissayi;
    }
    public void hiz(double hiz){
        System.out.println("kopek "+hiz+" km/h hiz ile kosuyor...");
    }
    public void kos(){
        System.out.println("kosmaya basladi");
        hiz(60.0);
    }
    public int getDissayi() {
        return dissayi;
    }
    public void setDissayi(int dissayi) {
        this.dissayi = dissayi;
    }

}