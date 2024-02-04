/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ramazanakdag.hazelcastdemo;

/**
 *
 * @author RamazanFirat
 */
public class SystemStats {
    private int cpu;
    private int memory;
     
    public SystemStats(int cpu, int memory) {
        super();
        this.cpu = cpu;
        this.memory = memory;
    }
 
    public int getCpu() {
        return cpu;
    }
     
    public void setCpu(int cpu) {
        this.cpu = cpu;
    }
     
    public int getMemory() {
        return memory;
    }
     
    public void setMemory(int memory) {
        this.memory = memory;
    }
 
    @Override
    public String toString() {
        return "SystemStats [cpu=" + cpu + ", memory=" + memory + "]";
    }
    
}
