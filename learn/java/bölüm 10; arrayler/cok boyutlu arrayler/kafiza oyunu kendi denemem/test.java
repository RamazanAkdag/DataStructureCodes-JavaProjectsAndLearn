import java.util.Scanner;

public class test{
    private static Kart[][] kartlar = new Kart[4][4];

    public static void main(String[] args){

        kartlar[0][0] = new Kart('E');
        kartlar[0][1] = new Kart('A');
        kartlar[0][2] = new Kart('B');
        kartlar[0][3] = new Kart('F');
        kartlar[1][0] = new Kart('G');
        kartlar[1][1] = new Kart('A');
        kartlar[1][2] = new Kart('D');
        kartlar[1][3] = new Kart('H');
        kartlar[2][0] = new Kart('F');
        kartlar[2][1] = new Kart('C');
        kartlar[2][2] = new Kart('D');
        kartlar[2][3] = new Kart('H');
        kartlar[3][0] = new Kart('E');
        kartlar[3][1] = new Kart('G');
        kartlar[3][2] = new Kart('B');
        kartlar[3][3] = new Kart('C');

       
       int i = 1;
    while(oyunBittiMi() == false){
        System.out.println(i+". tur\n");
        tahmin_et();
        oyun_tahtasi();
        i++;
    }
        
    }
    public static void oyun_tahtasi(){
        System.out.println("____________________");
        System.out.println("");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(kartlar[i][j].isTahmin() == false){
                    System.out.print(" | | ");
                }else{
                    System.out.print(" |"+kartlar[i][j].getDeger()+"| ");
                }
            }
            System.out.println("");
        }
        System.out.println("____________________");
     }
     public static boolean oyunBittiMi(){
         for(int i=0;i<4;i++){
             for(int j=0;j<4;j++){
                 if(kartlar[i][j].isTahmin() == false){
                     return false;
                 }
             }
            
         }
         return true;
     }
     public static void tahmin_et(){
         Scanner scanner = new Scanner(System.in);
         System.out.print("1. tahmin : ");
         int i1 = scanner.nextInt();
         int j1 = scanner.nextInt();
         kartlar[i1][j1].setTahmin(true);
         oyun_tahtasi();
         System.out.print("2. tahmin : ");
         int i2 = scanner.nextInt();
         int j2 = scanner.nextInt();
         if(kartlar[i1][j1].getDeger() == kartlar[i2][j2].getDeger()){
             kartlar[i1][j1].setTahmin(true);
             kartlar[i2][j2].setTahmin(true);
         }else{
             kartlar[i1][j1].setTahmin(false);
             kartlar[i2][j2].setTahmin(false);
         }
     }
}