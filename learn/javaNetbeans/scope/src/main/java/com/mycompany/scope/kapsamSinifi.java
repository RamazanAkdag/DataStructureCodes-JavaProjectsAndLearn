/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.scope;

/**
 *
 * @author Ramazan Fırat
 */
public class kapsamSinifi {
    private int ramo = 30;
    
    public kapsamSinifi(){
        System.out.println("ramo = " + ramo);    
    }
    
    public void onIleCarp(){
        int ramo = 10;
        
        for(int i = 1; i <6;i++){
            System.out.println(i + "*" + ramo + ":" + i*ramo);
        }
    }
    
    
    
}
