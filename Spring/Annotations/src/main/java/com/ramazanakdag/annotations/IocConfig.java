
package com.ramazanakdag.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ramazanakdag.annotations")
public class IocConfig {
    @Bean
    public ICustomerDal customerDal(){
        return new MySqlCustomerDal();
    }
    
    @Bean
    public ICustomerService customerService(){
        return  new CustomerManager(customerDal());
    }
    
}
