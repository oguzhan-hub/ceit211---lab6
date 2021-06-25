package com.company;

public class Television {
    private String manufacturer;
    private int screenSize;
    private boolean powerOn;
    private int channel;
    private int volume = 20;

    public Television(String brand, int size){
        this.manufacturer = brand;
        this.screenSize = size;
    }

    public void setChannel(int station){
        this.channel = station;
    }
    public void power(boolean on){
        this.powerOn = on;
    }
    public void increaseVolume(){
        if(volume <100){
            this.volume += 1;
        }
    }
    public void decreaseVolume(){
        if(this.volume > 0){
            this.volume -= 1;
        }
    }
    public int getChannel(){
        return this.channel;
    }
    public int getVolume(){
        return this.volume;
    }
    public String getManufacturer(){
        return this.manufacturer;
    }
    public int getScreenSize(){
        return this.screenSize;
    }

}
