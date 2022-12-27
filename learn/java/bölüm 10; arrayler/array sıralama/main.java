import java.util.Arrays;
import java.util.Scanner;
public class main{
    //////////
    public static int[] arrayi_doldur(int n){
        Scanner ramo = new Scanner(System.in);
        int dizi[] = new int[n];
        for(int i = 0;i<n;i++){
            dizi[i] = ramo.nextInt();
        }
        return dizi;
    }
    //////////
    public static void array_sort(int[] array){//kucukten buyuge sıralama
        Arrays.sort(array);//arrays default classında bulunan kucukten buyuge sıralama metodu.
        arrayi_bas(array);
    }
    public static void arrayi_bas(int[] array){
        for(int i =0 ;i<array.length;i++){
            System.out.println("dizimizin "+(i+1)+". elemani : "+array[i]);
        }
    }

    public static void main(String[] args){

        /*int a[] =  arrayi_doldur(5);
        array_sort(a);*/
        //arrayi_bas(a);

        int[] a1 = {1,2,3,4,5,6};
        int[] a2 = {1,2,3,4,5,6};

        if(Arrays.equals(a1, a2)){//dizilerin degerlerini karsılastıran default boolean metodu
            System.out.println("diziler esit");
        }else{
            System.out.println("esit degiller...");
        }





    }
}