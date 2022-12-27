import java.util.Scanner;

public class kosul { 

    public static void main(String[] args){
        Scanner ramo = new Scanner(System.in);
       /* System.out.println("yasinizi giriniz...\n");
        int yas =  ramo.nextInt();

        if(yas < 18){
            System.out.println("henuz resit degilsiniz...\n");
        }else if(yas == 18){
            System.out.println("resit olma yasindasiniz...\n");
        }else{
            System.out.println("resitsiniz...\n");
        }

        switch(yas){
            case 15: System.out.println("sekste gucluyum");break;
            case 18: System.out.println("adam mi oldun lan gvsek");break;
            case 20: System.out.println("kac yasina geldin hala 31 e guluyosun amcik");break;
            default: System.out.println("yasin bi sikime yaramiyor demkki kardessz sg");break;
        }*/
        int a,b,c;
        System.out.println("1. sayi : "+ (a = ramo.nextInt()));
        System.out.println("2. sayi : "+ (b = ramo.nextInt()));
        System.out.println("3. sayi : "+ (c = ramo.nextInt()));

        int enb = a;
        if(b > enb){
            enb = b;
        }if(c > enb){
            enb = c;
        }

        System.out.println("en buyuk sayi " + enb);

        
    }
}