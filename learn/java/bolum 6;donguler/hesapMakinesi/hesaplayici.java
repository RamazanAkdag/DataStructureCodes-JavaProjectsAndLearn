import java.util.Scanner;

public class hesaplayici{
    public static void main(String[] args){
        Scanner ramo = new Scanner(System.in);
System.out.println("hesap makinesine hosgeldiniz...\n4 islem icin 1'i, baska islemler icin(log: 2,pow: 3 vb.) giriniz...\n");
        int sorgu = ramo.nextInt();
        
        if(sorgu == 1){
            System.out.print("sayi 1 : ");
            Double s1 = ramo.nextDouble();
            System.out.println("yapmak istedigin islemi sec ( + , - , x , / )");
            String islem = ramo.next();

            switch(islem){
                case "+" : 
                    System.out.println("sayi 2 : ");
                    double s2 = ramo.nextDouble();
                    System.out.println(s1 + " + " + s2 + " toplam sonucu : " + (s1+s2)); break;
                case "-" : 
                     System.out.println("sayi 2 : ");
                      s2 = ramo.nextDouble();
                      System.out.println(s1 + "-"+ s2 + " farki : " + ((s1 > s2) ? (s1 - s2) : (s2 - s1) ));break;
                case "x" : 
                    System.out.println("sayi 2 : ");
                     s2 = ramo.nextDouble();
                     System.out.println(s1 + " x " + s2 + " carpimi : " + (s1*s2)); break;
                case "/" : 
                     System.out.println("sayi 2 : ");
                    s2 = ramo.nextDouble();
                    System.out.println(s1 + " / " + s2 + " bolumu : " + (s1*s2)); break;
            }
        }else if(sorgu == 3){
            System.out.println("tabani giriniz...\n");
                int taban = ramo.nextInt();
            System.out.println("ussu giriniz...\n");
                int us = ramo.nextInt();
            int sonuc = 1;
            for(int i = 1; i <= us; i++ ){
                sonuc *= taban;
            }
            System.out.println(taban + "^" + us + " : " + sonuc);
        }

    }
}