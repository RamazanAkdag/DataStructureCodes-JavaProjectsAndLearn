import java.util.Scanner;
public class atm{
    Scanner ramo =  new Scanner(System.in);
    public void atm(hesap hesap){
        String kar;
        System.out.println("hosgeldiniz sn " + hesap.getKullanici_adi());
        while(true){
        System.out.println("********************************");
        String islemler = " \n1 - bakiye ogrenme\n"
                        + "2 - para cekme\n"
                        + "3 - paray yatirma\n"
                        + "q - cikis\n";
        System.out.println(islemler);
        System.out.println("********************************");
        System.out.println("yapmak istediginiz islemi seciniz ?");
        //ramo.nextLine();
        kar  = ramo.nextLine();
        switch(kar){
            case "1" :System.out.println("mevcut bakiyeniz : " + hesap.getBakiye());break;

            case "2" : System.out.println("cekmek istediginiz miktari giriniz...");
                        double miktar = ramo.nextDouble();
                        ramo.nextLine();
                        hesap.cek(miktar);break;

            case "3" :System.out.println("yatirmak istediginiz miktari giriniz...");
                     miktar = ramo.nextDouble();
                     ramo.nextLine();
                    hesap.yatir(miktar);break;

            case "q" :System.out.println("programdan cikiliyor...Hoscakalin..."); return; 

            default : System.out.println("yanlis bir islem girildi...");break;

        }
        }
    }
}