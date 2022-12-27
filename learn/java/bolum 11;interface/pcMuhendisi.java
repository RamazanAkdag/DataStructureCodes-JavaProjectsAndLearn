public class pcMuhendisi implements Imuhendis{

    private boolean askerlik;
    private boolean adli_sicil;

    public pcMuhendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }

    @Override
    public void adli_sicil_sorgula() {
        if(adli_sicil){
            System.out.println("adli sicil kaydı mevcut.Şahıs sabıkalı");
        }else{
            System.out.println("sabıka kaydi buunmuyor");
        }
        
    }

    @Override
    public void askerlik_durumu_sorgula() {
        if(askerlik){
            System.out.println("askerlik yapılmış");
        }else{
            System.out.println("askerlik yapılmamış");
        }
        
    }

    @Override
    public void is_tecrubesi(String a) {
        System.out.println("şahsın iş tecrubeleri sunlardir...");

        System.out.println(a);
        
    }

    @Override
    public String mezuniyet_ort(double derece) {
        
        return "mezuniyet ortalamasi : " + derece;
    }

}