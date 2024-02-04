/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ramazanakdag.hazelcastdemo;

import com.hazelcast.topic.Message;
import com.hazelcast.topic.MessageListener;

/**
 *
 * @author RamazanFirat
 */
public class HazelcastListener implements MessageListener<SystemStats>{
      @Override
    public void onMessage(Message<SystemStats> message) {
        SystemStats systemStats = message.getMessageObject();
        System.out.println("Message received from hazelcast. " + systemStats);
    }
     
}