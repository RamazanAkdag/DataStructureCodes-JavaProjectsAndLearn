/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ygsLysProject;

import com.mycompany.javakursaftergenerics.generics.*;

/**
 *
 * @author Ramazan Fırat
 */
public class sayisal extends Aday{

    public sayisal(int turkce, int mat, int edebiyat, int fizik,String isim) {
        super(turkce, mat, edebiyat, fizik,isim);
    }
    
    public int puanHesapla(){
        return getEdebiyat()*5 + getMat()*5 + getTurkce()*1 + getFizik()*4;
    }
    
    
}
