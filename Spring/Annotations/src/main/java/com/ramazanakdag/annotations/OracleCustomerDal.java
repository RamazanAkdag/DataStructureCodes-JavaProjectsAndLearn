
package com.ramazanakdag.annotations;

import org.springframework.stereotype.Component;


public class OracleCustomerDal implements ICustomerDal{

    @Override
    public void add() {
        System.out.println("added to OracleDb");
    }
      
}
