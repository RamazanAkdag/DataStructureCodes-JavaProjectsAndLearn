/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ramo.matematik;

/**
 *
 * @author Ramazan Fırat
 */
public class matematik implements IMatematik{

    @Override
    public void toplama(int a, int b) {
        System.out.println("toplama sonucu : " + (a + b));
    }

    @Override
    public void cikarma(int a, int b) {
        System.out.println("cikarma sonucu : "+ (a - b));
    }

    @Override
    public void carpma(int a, int b) {
        System.out.println("carpma sonucu : " + (a * b));
    }

    @Override
    public void bolme(int a, int b) {
        System.out.println("bolme sonucu : "+ (a / b));
    }
    
    /*
    jar dosyası olusturup kutuphane olarak kullanmak için projeye sag tık yapıp clean build yapıyosun
    sol ustten files kısmına gel paketler 3 target kısmından paketler 3 projesinin jar dosyasına ulasabilirsin */
    
    
    
}
