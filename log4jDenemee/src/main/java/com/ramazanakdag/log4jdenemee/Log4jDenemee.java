

package com.ramazanakdag.log4jdenemee;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.Appender;

/**
 *
 * @author RamazanFirat
 */
public class Log4jDenemee {
    public static final Logger logger = LogManager.getLogger();

    
    public static void main(String[] args) {
        
        LocalTime previousTime = LocalTime.now();
        //System.out.println(time.getMinute());
        while(true) {
            LocalTime newTime = LocalTime.now();
            
            if(newTime.getMinute() != previousTime.getMinute()){
                previousTime = newTime;
                logger.info("dakika degisti : " + newTime);
            }
            if(newTime.getSecond() != previousTime.getSecond()){
                previousTime = newTime;
                logger.debug("saniye degisti : " + newTime);
            }
            
            
        }
        
        
        
    }
}
