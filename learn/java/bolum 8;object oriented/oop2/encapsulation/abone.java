public class abone{
    public String isim;
    public int bakiye;
    public String sehir;

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






}