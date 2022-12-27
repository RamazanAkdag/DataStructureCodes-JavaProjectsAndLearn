/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javakursaftergenerics.generics;

/**
 *
 * @author Ramazan Fırat
 */
abstract class Aday {

    public int getTurkce() {
        return turkce;
    }

    public void setTurkce(int turkce) {
        this.turkce = turkce;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getEdebiyat() {
        return edebiyat;
    }

    public void setEdebiyat(int edebiyat) {
        this.edebiyat = edebiyat;
    }

    public int getFizik() {
        return fizik;
    }

    public void setFizik(int fizik) {
        this.fizik = fizik;
    }

    public Aday(int turkce, int mat, int edebiyat, int fizik) {
        this.turkce = turkce;
        this.mat = mat;
        this.edebiyat = edebiyat;
        this.fizik = fizik;
    }
    private int turkce;
    private int mat;
    private int edebiyat;
    private int fizik;
    
    abstract int puanHesapla();
    
}
