import java.util.Scanner;

public class ucgen{
    public static void main(String[] args){
        Scanner ramo = new Scanner(System.in);
        System.out.print("bir sayi giriniz...\n");
        int satir = ramo.nextInt();

        for(int i = 0; i< satir;i++){
                for(int j = 0; j<satir; j++){
                    if(i-j == satir/2 ||i+j == satir/2 || j-i == satir/2 || j+i == satir + satir/2 - 1 || i == satir/2 || j == satir/2 ){
                            System.out.print("*");
                    }
                    else{
                            System.out.print(" ");
                    }
     }
             System.out.print("\n");
        }


    }
}