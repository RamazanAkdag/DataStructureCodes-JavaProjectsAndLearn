/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javakursaftergenerics.generics;

/**
 *
 * @author Ramazan Fırat
 */
public class esitAgirlik extends Aday{

    public esitAgirlik(int turkce, int mat, int edebiyat, int fizik) {
        super(turkce, mat, edebiyat, fizik);
    }

    @Override
    int puanHesapla() {
        return getEdebiyat()*5 + getTurkce()*5 + getMat()*4 + getFizik()*1;
    }

   
    
    
    
}
