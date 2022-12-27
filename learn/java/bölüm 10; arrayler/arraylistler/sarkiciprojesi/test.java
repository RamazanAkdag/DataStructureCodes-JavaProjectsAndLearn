import java.util.Scanner;

public class test{
    private static sarkicilar sarkicilar = new sarkicilar();
    private static Scanner ramo = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("\t sarkici uygulamasına hosgeldiniz...");

        
while(true){
    islemleri_bastir();
        String secim = ramo.nextLine();
        switch(secim){
            case "1" : 
                System.out.println("eklemek istediginiz sarkici ismi giriniz...");
                String isim = ramo.nextLine();
                sarkicilar.sarkiciEkle(isim);
                System.out.println(isim+" isimli sarkici eklendi...");break;

            case "2" :System.out.println("guncellemek istediginiz sarkicinin ismini ve istediginiz pozisyonu giriniz..."); 
                        isim = ramo.nextLine();
                        int pos = ramo.nextInt();
                        ramo.nextLine();
                        sarkicilar.sarkiciGuncelle(isim, pos);
                        System.out.println(pos+" pozisyonundaki sarkicinin ismi "+isim+" olarak güncellendi..." );break;
                    

            case "3" :System.out.println("silmek istediginiz sarkici pozisyonunu giriniz");
                      pos = ramo.nextInt();
                      ramo.nextLine();
                        sarkicilar.sarkici_sil(pos);
                       break;

            case "4" : System.out.println("aradiginiz sarkicinin ismini giriniz...");
                        isim = ramo.nextLine();
                        sarkicilar.sarkiciAra(isim);break;
            case "5" : 
            sarkicilar.sarkicilariBastir();break;
            
            case "q"  : System.out.println("programdan cikiliyor...");
            return;

            default : System.out.println("hatali islem...");
        }
    }
    }
    public static void islemleri_bastir(){
        System.out.println("1- sarkici ekle\n2- sarkici guncelle\n3- sarkici sil\n4- sarkici ara\n5-sarkicilari yazdir\nq- cıkıs");

    }
}