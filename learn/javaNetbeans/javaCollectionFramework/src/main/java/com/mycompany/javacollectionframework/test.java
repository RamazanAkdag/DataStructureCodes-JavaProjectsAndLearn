/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javacollectionframework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Ramazan Fırat
 */
public class test {
    public static void zamanHesapla(String veri_tipi,List<Integer> list){
        long baslangic;
        long bitis;
        
        baslangic = System.currentTimeMillis();
        for(int i = 0;i < 100000; i ++){
            list.add(0,i);
        }
        bitis = System.currentTimeMillis();
        
        System.out.println(veri_tipi + "ekleme süresi : " + (bitis - baslangic));
    }
    public static void main(String[] args) {
        //ArrayList<String> arrayList = new ArrayList<String>();
        
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        //list.add("java");
        //list.add("python");
        //list.add("c++");
        //System.out.println(list.get(0));
        //System.out.println(list.get(2));
        
        zamanHesapla("arraylist",arrayList);
        zamanHesapla("linkedList",linkedList);
    }
    
}
