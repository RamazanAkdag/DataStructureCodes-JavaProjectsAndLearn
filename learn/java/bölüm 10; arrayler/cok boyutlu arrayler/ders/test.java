import java.util.Scanner;
public class test{
    public static void arrayi_doldur(int[][] array){
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                array[i][j] = scanner.nextInt();
            }
        }
}
    public static void arrayi_bas(int[][] array){
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(array[i][j]+"  ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args){
        Scanner ramo =new Scanner(System.in);
        //int[][] a = {{1,2},{3,4},{5,6}};
        int [][] a2 = new int[3][2];
        arrayi_doldur(a2);
        arrayi_bas(a2);
        /*for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }*/
    }
}