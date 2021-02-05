/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;


public class NormalSub implements Observer{
    
    ChannelData cd;
    String name;
    
    public NormalSub(String name , ChannelData cd){
        this.name = name;
        this.cd = cd;
        cd.registerObserver(this);
    }
    
    public void update(String channelName){
        displayInfos(channelName);
    }
    
    public void displayInfos(String channelName){
        System.out.println("Hi " + this.name + " " + channelName + " uploaded new video.");
        
    }
    
}
