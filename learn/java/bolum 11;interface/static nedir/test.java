public class test{
    public static void main(String[] args) {
        //static ozellikler direk sınıf ismi uzerinden ulasılabilen ozelliklerdir ulasmak icin obje olusturmaya gerek yoktur...
        seyirci s1 = new seyirci("ramo");
        seyirci s2 = new seyirci("mami");

        s1.oyun_seyret();
        s2.oyun_seyret();
        System.out.println(seyirci.seyirciSayisi);//class ismiyle ulasılan deger

        System.out.println(s1.seyirciSayisi);//veya objenin adıyla da ulasılabilir
    }
}