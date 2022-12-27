
 import java.util.Scanner;
public class bki{
    public static void main(String[] args){
        System.out.println("lutfen boyunuzu ve kilonuzu giriniz...\n");
        Scanner selo = new Scanner(System.in);

        double boy = selo.nextDouble();
        double kilo = selo.nextDouble();

        double bki = kilo / (boy*boy);

        System.out.println("beden kitle indeksiniz : " + bki);

    }
}