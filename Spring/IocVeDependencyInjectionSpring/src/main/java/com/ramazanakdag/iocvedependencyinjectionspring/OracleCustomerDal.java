
package com.ramazanakdag.iocvedependencyinjectionspring;

public class OracleCustomerDal implements ICustomerDal{

    @Override
    public void add() {
        System.out.println("added to OracleDb");
    }
      
}
