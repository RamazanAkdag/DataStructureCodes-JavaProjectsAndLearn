/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javakursaftergenerics.generics;

/**
 *
 * @author Ramazan Fırat
 */
public class sayisal extends Aday{

    public sayisal(int turkce, int mat, int edebiyat, int fizik) {
        super(turkce, mat, edebiyat, fizik);
    }
    
    public int puanHesapla(){
        return getEdebiyat()*5 + getMat()*5 + getTurkce()*1 + getFizik()*4;
    }
    
    
}
