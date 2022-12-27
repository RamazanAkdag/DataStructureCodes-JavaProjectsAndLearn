public class yonetici extends calisan{

    private int sorumluKisi;
    
    
    
    
    
    public yonetici(int maas, String isim, String departman,int sorumluKisi) {
        super(maas, isim, departman);
        this.sorumluKisi = sorumluKisi;
        //TODO Auto-generated constructor stub
    }//subclass
    public void zam(double zamMik){
        System.out.println("calisanlarin maaslarina  "+zamMik+ " kadar zam yapildi...");
    }

    /*public yonetici(int maas,String isim,int departman){

        //super(maas, isim, departman);//superclass icindeki constructoru cagirmayi sagliyor
    }*/

    
}