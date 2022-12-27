public class calisan{//superclass
    private String isim;
    private int maas;
    private String departman;

    public calisan(int maas,String isim,String departman){
        this.maas = maas;
        this.isim = isim;
        this.departman = departman;
    }
    public void yaz(){
        System.out.println("isim : " + isim);
        System.out.println("departman : "+ departman);
        System.out.println("maas : "+ maas);

    }
    public void departmanDegis(String yeniDepartman){
        this.departman = yeniDepartman;
    }
    
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public int getMaas() {
        return maas;
    }
    public void setMaas(int maas) {
        this.maas = maas;
    }
    public String getDepartman() {
        return departman;
    }
    public void setDepartman(String departman) {
        this.departman = departman;
    }
}