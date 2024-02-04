/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ramazanakdag.hazelcastdemo;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.topic.ITopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 *
 * @author RamazanFirat
 */
@Configuration
@EnableAsync
@EnableScheduling
public class HazelcastBroadcaster {
     
    private HazelcastInstance hz = Hazelcast.newHazelcastInstance();
     
    @Async
    @Scheduled(fixedRate = 1000)
    public void scheduleFixedRateTaskAsync() throws InterruptedException {
        //Get dashboard topic
        ITopic topic = hz.getTopic ("dashboard");
        //Generate dummy data
        SystemStats stats=new SystemStats(1200, 3500);
        //Publish generated data to topic
        topic.publish(stats);
        System.out.println("Message sent successfully to dashboard topic. " + stats);
        Thread.sleep(3000);
    }
  
}
