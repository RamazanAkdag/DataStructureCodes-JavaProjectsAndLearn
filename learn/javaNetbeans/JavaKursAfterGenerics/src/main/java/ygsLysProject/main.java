/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ygsLysProject;

/**
 *
 * @author Ramazan Fırat
 * 
 */


public class main {
    public static <E extends Aday> E birinci(E e1,E e2,E e3){
        if(e1.puanHesapla() > e2.puanHesapla() && e1.puanHesapla() > e3.puanHesapla()){
            return e1;
        }
        else if(e2.puanHesapla() > e1.puanHesapla() && e2.puanHesapla() > e3.puanHesapla()){
            return e2;
        }
        else if(e3.puanHesapla() > e1.puanHesapla() && e3.puanHesapla() > e2.puanHesapla()){
            return e3;
        }
        else{
            return null;
        }
        
        
        
    }
    
    public static void main(String[] args) {
        
                
    }
    
}
