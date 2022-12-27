import java.util.Scanner;

public class indeks{
    public static void main(String[] args){
        Scanner ramo =  new Scanner(System.in);
    double boy,kilo;
      
        System.out.print("boyunuzu giriniz...\n");
    boy = ramo.nextDouble();
        System.out.println("kilonuzu giriniz...\n");
    kilo = ramo.nextDouble();

    float bki = (float)(kilo/(boy*boy));

    if(bki <= 18.5){
        System.out.println(bki + " beden kitle indeksiyle oldukca zayifsiniz...\n");
    }else if(bki <=25 && bki > 18.5){
        System.out.println(bki+ " beden kitle indeksiyle kilonuz gayet normal...\n");
    }else if(bki <= 30 && bki > 25){
        System.out.println(bki + " beden kitle indeksiyle fazla kilolusunuz...\n");
    }else if(bki > 30){
        System.out.println(bki + " beden kitle indeksiyle obezsiniz...\n");
    }
    }
}