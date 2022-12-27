import java.util.Scanner;

public class login{
    Scanner ramo = new Scanner(System.in);
    public boolean log(hesap hesap){
        String ad,sifre;
        int deneme = 3;
        while(true){
            System.out.println("kullanici adinizi giriniz...");
            ad = ramo.nextLine();
            System.out.println("sifrenizi giriniz...");
            sifre = ramo.nextLine();
            if(ad.equals(hesap.getKullanici_adi()) && sifre.equals(hesap.getParola())){
                return true;
            }
            else if(ad.equals(hesap.getKullanici_adi()) && !sifre.equals(hesap.getParola()) ){
                System.out.println("sifreniz yanlis tekrar deneyiniz...");
                deneme--;
                System.out.println("kalan deneme hakkiniz : " +deneme);
            }else if(!ad.equals(hesap.getKullanici_adi()) && sifre.equals(hesap.getParola())){
                System.out.println("kullanici adiniz yanlis tekrar giriniz...");
                deneme--;
                System.out.println("kalan deneme hakkiniz : " +deneme);
            }else if(!ad.equals(hesap.getKullanici_adi()) && !sifre.equals(hesap.getParola()) ){
                System.out.println("kullanici adiniz da sifreniz de yanlis girilmistir...");
                deneme--;
                System.out.println("kalan deneme hakkiniz : " +deneme);
            }
            if(deneme == 0){
                System.out.println("deneme hakkiniz bitmistir.Giris yapabilmek icin programi tekrar calistiriniz...");
                return false;
            }

        }
        //System.out.println("\nprogramdan cikildi...");

    }
    
}