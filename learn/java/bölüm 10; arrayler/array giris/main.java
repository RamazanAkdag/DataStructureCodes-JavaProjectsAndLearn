import java.util.Scanner;

public class main{
    public static void arrayi_bas(int[] array){
        for(int i = 0;i < array.length;i++ ){
            System.out.println(array[i]);
        }
    }
    public static double ort(int[] array){
        int toplam = 0;
        for(int i = 0;i<array.length;i++){
            toplam += array[i];
        }
        return toplam/array.length;
    }
    public static void main(String[] args){
        //int[] a = new int[10];
        int[] b = {1,2,3,4,5,6,7,8,9,10};
        
        //System.out.println(b[5]);
        arrayi_bas(b);
        System.out.println(ort(b));
        
        
    }
}