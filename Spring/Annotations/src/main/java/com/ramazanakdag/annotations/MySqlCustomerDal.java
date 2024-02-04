
package com.ramazanakdag.annotations;

import org.springframework.stereotype.Component;


public class MySqlCustomerDal implements ICustomerDal{

    @Override
    public void add() {
        System.out.println("added to mysql db");
    }
    
}
