import java.util.ArrayList;
import java.util.Scanner;


public class sarkicilar{
    private ArrayList<String> sarkiciListesi = new ArrayList<String>();

        public void sarkicilariBastir(){
            System.out.println("sarkici listesinde "+sarkiciListesi.size()+" kadar sarkici var : ");
            for(int i=0;i<sarkiciListesi.size();i++){
                System.out.println((i+1)+". sarkici "+sarkiciListesi.get(i));
            }
            System.out.print("\n\n\n");
        }
        public void getSarkici(int index){
            sarkiciListesi.get(index);
        }
        public void sarkiciEkle(String isim){
            //Scanner ramo = new Scanner(System.in);

            sarkiciListesi.add(isim);
        }
        public void sarkiciGuncelle(String isim,int index){
            sarkiciListesi.set(index-1, isim);
        }
        public void sarkici_sil(int index){
            String isim = sarkiciListesi.get(index-1);
            sarkiciListesi.remove(index-1);
            System.out.println(isim+" isimli sarkici listeden silinmistir...");
        }
        public void sarkiciAra(String isim){
           int pozisyon =  sarkiciListesi.indexOf(isim);

           if(pozisyon>= 0){
               System.out.println("sanatci bulundu...");
               System.out.println(isim+" isimli sarkici "+(pozisyon + 1)+". sıradadir...");

           }else{
               System.out.println("sarkici bulunamadi...");
           }

        }



}