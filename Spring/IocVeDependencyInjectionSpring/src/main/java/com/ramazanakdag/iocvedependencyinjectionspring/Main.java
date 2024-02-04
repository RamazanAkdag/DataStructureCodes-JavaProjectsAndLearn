
package com.ramazanakdag.iocvedependencyinjectionspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("user-bean-config.xml");
        
        ICustomerService customerService = context.getBean("service",ICustomerService.class);
        
        //CustomerManager customerManager = new CustomerManager(context.getBean("database",ICustomerDal.class));
        customerService.add();
        
       
    }
}
