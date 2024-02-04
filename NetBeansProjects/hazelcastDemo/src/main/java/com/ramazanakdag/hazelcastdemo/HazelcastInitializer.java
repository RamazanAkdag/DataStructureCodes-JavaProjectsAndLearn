/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ramazanakdag.hazelcastdemo;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.topic.ITopic;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author RamazanFirat
 */
@Configuration
public class HazelcastInitializer {
     
    public HazelcastInitializer() {
            HazelcastListener hzListener=new HazelcastListener();
            Config cfg = new Config();
            HazelcastInstance hz = Hazelcast.newHazelcastInstance(cfg);
            //Get dashboard topic
            ITopic topic = hz.getTopic ("dashboard");
            //Initiliaze listener to dashboard topic
            topic.addMessageListener(hzListener);
            System.out.println("Hazelcast initialized successfully.");
    }
}
