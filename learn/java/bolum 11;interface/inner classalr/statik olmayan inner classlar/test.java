import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        matematik.factorial factorial = new matematik().new factorial();
        matematik.asal asal = new matematik().new asal();
        matematik.alan alan = new matematik().new alan();
        //Scanner scanner = new Scanner(System.in);

        /*System.out.println("bir sayı giriniz..");
        int sayi = scanner.nextInt();*/
        boolean s = asal.asal_mi();
        if(s){
            System.out.println("sayı asaldır");
        }else{
            System.out.println("asal degildir...");
        }



    }


}