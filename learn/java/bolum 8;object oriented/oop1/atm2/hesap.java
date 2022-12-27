public class hesap{
    private String kullanici_adi;
    private String parola;
    private double bakiye;

    public void yatir(double miktar){
        System.out.println("yatirmak istediginiz miktari giriniz...");
        bakiye += miktar;
        System.out.println("yeni bakiye " +bakiye );

    }
    public void cek(double miktar){
        if(miktar > bakiye){
            System.out.println("yetersiz bakiye...");
        }
        if(miktar > 1500){
            System.out.println("gunluk para cekme siniri 1500 tldir...");
        }
        else{
            bakiye -= miktar;
            System.out.println("yeni bakiye : " + bakiye);
        }
    }
    


    public hesap(String kullanici_adi, String parola, double bakiye) {
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }
    public String getKullanici_adi() {
        return kullanici_adi;
    }
    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }
    public String getParola() {
        return parola;
    }
    public void setParola(String parola) {
        this.parola = parola;
    }
    public double getBakiye() {
        return bakiye;
    }
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

}