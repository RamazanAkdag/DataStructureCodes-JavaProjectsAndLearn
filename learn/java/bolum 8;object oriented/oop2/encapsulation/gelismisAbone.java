public class gelismisAbone{
    private String isim;
    private int bakiye = 120;
    private String sehir;

    public gelismisAbone(String isim,int bakiye,String sehir){
        this.isim =isim;
        if(bakiye>0 && bakiye<=120){
            this.bakiye = bakiye;
        }
        this.sehir = sehir;
    }
    
    
    public void dogalgaz_kullan(int miktar){
        if((this.bakiye - miktar) < 0){
            System.out.println("yeterli bakiye yok");
        }else{
            this.bakiye -=miktar;
            if(this.bakiye <= 0){
                System.out.println("bakiyeniz bitti. Lutfen bakiye yukleyin... " + "kredi limiti : 120 tl");
            }else{
                System.out.println("yeni bakiye : "+bakiye);
            }
        }
    }

    public void bakiye_ogren(){
        System.out.println("bakiye = " + bakiye);
    }


    public String getIsim() {
        return isim;
    }


    public void setIsim(String isim) {
        this.isim = isim;
    }


    public int getBakiye() {
        return bakiye;
    }


    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }


    public String getSehir() {
        return sehir;
    }


    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

}