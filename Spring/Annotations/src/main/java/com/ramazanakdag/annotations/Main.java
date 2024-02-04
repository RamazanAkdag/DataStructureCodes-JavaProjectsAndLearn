
package com.ramazanakdag.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);
        
        ICustomerService customerService = context.getBean("customerService",ICustomerService.class);
        
   
        customerService.add();
        
       
    }
}
