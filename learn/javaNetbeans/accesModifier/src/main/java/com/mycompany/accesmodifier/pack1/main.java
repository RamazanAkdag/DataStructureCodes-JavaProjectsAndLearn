/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.accesmodifier.pack1;
import com.mycompany.accesmodifier.*;
/**
 *
 * @author Ramazan Fırat
 */
public class main {
    public static void main(String[] args) {
        araba araba = new araba();
        
        /*araba classının erişim belirleyici public oldugundan mutevellit
        direk erişim saglanabilir*/
        /*erişim belirleyici kullanılmadan yazılmış bir classa sadece aynı paket içerisdinden erişim saglanabilir*/
        
        /*class tanımlarken private ve protected erişim belirleyiciler kullanılamaz*/
        /*private olarak tanımlanan özellikler sadece aynı classtan erişilebilir. get ve set metotları olmadan*/
        /*protected olarak tanımlanan özelliklere aynı paketteki claslar üzerinden erişilebilir
        .paket dışındaki classlardan da sadece alt class durumunda olanlar erişebilir*/
    }
    
}
