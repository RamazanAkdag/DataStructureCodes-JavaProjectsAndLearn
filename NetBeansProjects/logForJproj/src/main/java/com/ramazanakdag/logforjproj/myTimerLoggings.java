/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ramazanakdag.logforjproj;

import java.util.Timer;
import java.util.TimerTask;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author RamazanFirat
 */
class th1 implements Runnable{

    @Override  //1 sn ara ile çalışacak
    public void run() {
       Timer myTimer1=new Timer();
       TimerTask gorev1 =new TimerTask() {
 
                    @Override
                    public void run() {
                        Logger logger = LogManager.getLogger();
                        logger.debug("Debug Log");
                        
                           
                    }
             };
        myTimer1.schedule(gorev1,0,1000);
    }
    
}
class th2 implements Runnable{

    @Override //1 dakika ara ile çalışacak
    public void run() {
      Timer myTimer2=new Timer();
       TimerTask gorev2 =new TimerTask() {
 
                    @Override
                    public void run() {
                        Logger logger = LogManager.getLogger();
                        logger.debug("Debug Log");
                        
                           
                    }
             };
        myTimer2.schedule(gorev2,0,60*1000);
    }
    
}
class th3 implements Runnable{

    @Override // 1 saat ara ile çalışacak
    public void run() {
       Timer myTimer1=new Timer();
       TimerTask gorev1 =new TimerTask() {
 
                    @Override
                    public void run() {
                        Logger logger = LogManager.getLogger();
                        logger.debug("Debug Log");
                        
                           
                    }
             };
        myTimer1.schedule(gorev1,0,60*60*1000);
    }
    
}
public class myTimerLoggings {
    
    public static void main(String[] args) {
      
       /* Thread th1 = new Thread(new th1());
        Thread th2 = new Thread(new th2());
        Thread th3 = new Thread(new th3());
        
        th1.start();
        th2.start();
        th3.start();*/
        Logger logger = LogManager.getLogger();
        logger.info("selamlar");
        
     
      
      
             
          
        
            
    }
    
    
   
}
