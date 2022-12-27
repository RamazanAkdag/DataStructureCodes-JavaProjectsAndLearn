public class test{
    public static void main(String[] args) {
        Integer[] ramo = {1,2,3,4,5,6};
        Character[] selo = {'j','a','v','a'};
        String[] kero  = {"python","java","c++","php"};
        yazdirmaSinifi<String> yString = new yazdirmaSinifi<String>();
        yazdirmaSinifi<Character> yChar = new yazdirmaSinifi<Character>();
        yazdirmaSinifi<Integer> yInt = new yazdirmaSinifi<Integer>();
        yString.yazdir(kero);
        System.out.println("************************************");
        yChar.yazdir(selo);
        System.out.println("************************************");
        yInt.yazdir(ramo);
        System.out.println("************************************");
        //yaz(selo);
    }
    //generic olarak metod olusturma 
    public static <E> void yaz(E[] dizi){
        for(E e : dizi){
            System.out.println(e);
        }
    }
 }