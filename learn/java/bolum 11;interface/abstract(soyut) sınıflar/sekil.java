public abstract class sekil{
    private String isim;

    public sekil(String isim) {
        this.isim = isim;
    }

    public void isimSoyle(){
        System.out.println("bu obje " + isim + " objesidir");
    }
   
    abstract void alan_hesapla();//interfacelerdeki gibi bu classı implement eden classlar bu fonksiyonu kendi yazmak zorunda kalır...

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}