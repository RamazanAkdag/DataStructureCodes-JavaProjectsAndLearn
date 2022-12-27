/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.threadolusturma;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramazan Fırat
 */
public class printer extends  Thread{
    private String isim;

    public printer(String isim) {
        this.isim = isim;
    }

    @Override
    public void run() {

        System.out.println(isim+"calısıyor...");
        
        for(int i  = 1; i <= 10; i++){
            try {
                System.out.println(isim+" yazıyor: "+i);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("sistemde hata olustu...");
            }
        }
    }
    
    
     
}
