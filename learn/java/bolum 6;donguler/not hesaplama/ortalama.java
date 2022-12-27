import java.util.Scanner;
public class ortalama{
    public static void main(String[] args){
        Scanner ramo = new Scanner(System.in);
        System.out.println("KTU not hesaplamaya hosgeldiniz...\n");
        /*vize 1: %30 
        vize 2: %30
        final : %40*/
        System.out.print("1. vize sonucunu giriniz :");
        double vize1 = ramo.nextDouble();
        double v1effct = vize1*30/100;
        System.out.print("\n2. vize sonucunu giriniz :");
        double vize2 = ramo.nextDouble();
        double v2effct = vize2*30/100;
        System.out.print("\nfinal sonucunu giriniz :");
       double fnal = ramo.nextDouble();
        double fnaleffct = fnal*40/100;

        double ort = fnaleffct + v1effct + v2effct;

        System.out.print("ortalamaniz : " + ort);







    }
}