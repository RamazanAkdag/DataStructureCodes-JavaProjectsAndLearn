
package com.ramo.matematik;

public class matematik implements Imatematik{

    @Override
    public void toplama(int a, int b) {
        System.out.println(a+b);
    }

    @Override
    public void cikarma(int a, int b) {
        if(a>b){
            System.out.println(a-b);
        }else{
            System.out.println(b-a);
        }
    }

    @Override
    public void carpma(int a, int b) {
        System.out.println(a*b);
    }

    @Override
    public void bolme(int a, int b) {
        System.out.println((double)a/b);
    }
    
    
}
