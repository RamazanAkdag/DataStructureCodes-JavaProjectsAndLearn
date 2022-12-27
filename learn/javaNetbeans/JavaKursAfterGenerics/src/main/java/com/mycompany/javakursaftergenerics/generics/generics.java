/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javakursaftergenerics.generics;

import java.util.ArrayList;

/**
 *
 * @author Ramazan Fırat
 */
public class generics {
    /*public static <E>void yazdir(E[] dizi){
               for(E e: dizi){
                   System.out.println(e);
               }
    }*/
    public static <E extends Aday> E birinci(E e1,E e2){/*sadece aday classından extend edilen classların nesnelerini parametre alabilir diyoruz*/
        if(e1.puanHesapla() > e2.puanHesapla())
               return e1;
        else 
            return e2;
           
    }
    public static void main(String[] args){
        sayisal say1 = new sayisal(45, 30, 25, 10);
        sayisal say2 = new sayisal(20, 35, 14, 3);
        
        sayisal birinci  = birinci(say1, say2);
        
        System.out.println("birinci ogrencinin puani :" + birinci.puanHesapla());
        
        esitAgirlik ea1 = new esitAgirlik(45, 30, 20, 10);
        esitAgirlik ea2 = new esitAgirlik(15,25, 40, 2);
        
        esitAgirlik eaBirinci = birinci(ea1,ea2);
        
        System.out.println("birinci eanın puani : "+eaBirinci.puanHesapla());
        
        
        //ArrayList<String> arrayList1 = new ArrayList<String>();
        
        //ArrayList<Integer> arrayList2 = new ArrayList<>();
        
        /* 
        public class ArrayList<E> extends AbstractList<E>
        implements List<E>, RandomAccess, Cloneable, java.io.Serializable
        
        --Bu yukarıdaki yapı generic classların yapısıdır. E ile ifade edilen yere kullanıcıya görd istenilen veri tipi gecebilir
        --Oraya herhangi bir veri tipi atanmışsa o classın icinde E ile gösterilen her yere o veri tipi yazılmış gibi olur
        
        */
        
        /*Character[] char_dizi = {'J','A','V','A'};
        Integer[] IntegerDizi = {1,2,3,4,5,6};
        String[] StringDizi = {"Java","Python","C++","PHP"};
        
        Ogrenci[] OgrenciDizi = {new Ogrenci("Mustafa"),new Ogrenci("Ramazan"),new Ogrenci("Oyku")};*/
        
    
    
    }
      
    
}