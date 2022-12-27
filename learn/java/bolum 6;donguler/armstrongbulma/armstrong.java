import java.util.Scanner;
public class armstrong{
    public static void main(String[] args){
        Scanner ramo = new Scanner(System.in);
        int n = ramo.nextInt();
            int k = 0;
            while(true){
                int o = n;
                o = o/10;
                if(o > 0){
                    k++;
                }else{
                    break;
                }
            }
         if(Math.pow((n%10), k) +  Math.pow((n%100)/10, k) + Math.pow(((n/1000)/100), k) + Math.pow(((n%10000)/1000) , k) == n){
             System.out.println(n+ "armstrong sayidir...\n");
         }else{
            System.out.println( n +"armstrong sayi degildir...\n");
         }
            

            
        
    }
}