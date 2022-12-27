/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javakursaftergenerics.generics;

/**
 *
 * @author Ramazan Fırat
 */
public class Ogrenci {
       private String isim;

    @Override
    public String toString() {
        return "isim " + isim;// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Ogrenci(String isim) {
        this.isim = isim;
    }
    
    
}
