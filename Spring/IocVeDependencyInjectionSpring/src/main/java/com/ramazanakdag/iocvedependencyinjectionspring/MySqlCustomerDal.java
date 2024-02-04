
package com.ramazanakdag.iocvedependencyinjectionspring;

public class MySqlCustomerDal implements ICustomerDal{

    @Override
    public void add() {
        System.out.println("added to mysql db");
    }
    
}
