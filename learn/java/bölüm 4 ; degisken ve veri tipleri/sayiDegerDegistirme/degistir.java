import java.util.Scanner;
public class degistir{
    public static void main(String[] args){
       int a,b;
       Scanner ramo = new Scanner(System.in);
       System.out.print("a sayisini gir :");
       a = ramo.nextInt();
       System.out.print("b sayisini gir:");
       b = ramo.nextInt();

       System.out.println("a sayisi : "+ a + "\nb sayisi : " + b);
       int g = a;
       a = b;
       b = g;
       System.out.println("deisince a sayisi : "+ a + "\ndeisince b sayisi : " + b);


    }
}