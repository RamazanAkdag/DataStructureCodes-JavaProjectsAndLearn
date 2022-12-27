import java.util.ArrayList;

public class main{
    //fonka arraylist gondermek
    public static void yazdir(ArrayList<String> a){
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
    }
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("metalica");
        arrayList.add("guns n roses");
        arrayList.add("cyberpunk");
        arrayList.add("iron maiden");
       // System.out.println(arrayList.get(0));
       //arrayList.remove(1);//1. indexdeki elemani sildik guns n roses
       System.out.println(arrayList.indexOf("metalica"));//metallicanın kacıncı indexde bulundugunu gosterir.eger parantezin icine 
       //yazdigin deger arayliste dahil degilse -1 degerini dondurur.
       
        //System.out.println(arrayList.size());
      /*  for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }*/
        arrayList.set(3,"megadeath");//set fonku araylistin indeksinde var olan degeri degistrimeye yariyor...
        /*System.out.println("guncellenmis hali");
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));*/
            yazdir(arrayList);
        }


    }
