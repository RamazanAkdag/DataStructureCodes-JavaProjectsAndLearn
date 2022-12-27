import java.util.Scanner;
public class km{
    public static void main(String[] args){
        Scanner ramo = new Scanner(System.in);
        System.out.print("kilometrenizi giriniz : ");
        double yol = ramo.nextDouble();
        double kmBasiUcret = 12.0;

        double cost = kmBasiUcret*yol;

        System.out.print(yol + " km icin odeyeceginiz tutar : " + cost );


    }
}