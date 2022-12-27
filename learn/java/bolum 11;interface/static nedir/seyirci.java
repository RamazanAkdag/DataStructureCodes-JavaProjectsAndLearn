public class seyirci{
    private String isim;

    public static int seyirciSayisi = 0;//ister obje ismiyle ister class ismiyle ulasabilecegin bir ozellik...

    public seyirci(String isim) {
        this.isim = isim;
        seyirciSayisi++;/*her obje olusturdugunda bu constructor devreye gireceginden her obje olustugunda seyirci sayisi
        1 artıcak bu sayede kac obje olusturdugunu gorebiliceksin*/ 
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void oyun_seyret(){
        System.out.println(isim + " oyun seyrediyor...");
    }
}