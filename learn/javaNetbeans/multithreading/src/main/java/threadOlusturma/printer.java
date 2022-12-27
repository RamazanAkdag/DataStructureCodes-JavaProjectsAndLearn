/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threadOlusturma;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramazan Fırat
 */
public class printer extends Thread
{

    @Override
    public void run() {
        System.out.println(isim + "çalışıyor...");

        for(int i = 1;i<=10;i++){
            try {
                System.out.println(isim + "yazıyor :" +i);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                
                System.out.println("thread kesintiye ugradı...");
            }
        }
        System.out.println("thread isini bitirdi...");
    }

    public printer(String isim) {
        this.isim = isim;
    }
    private String isim;
    
    
    
    
    
}
