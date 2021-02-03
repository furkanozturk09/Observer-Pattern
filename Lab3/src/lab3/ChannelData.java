/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.ArrayList;

/**
 *
 * @author aybuke.kececi
 */
public class ChannelData implements Subject{
    private ArrayList<Observer> subs;
    String st;
    
    public ChannelData(String st){
        subs = new ArrayList<Observer>();
        this.st = st;
    }
    
    @Override
    public void registerObserver(Observer o){
        subs.add(o);
    }
    
    @Override
    public void removeObservers(Observer o){
        int i = subs.indexOf(o);
        if (i >= 0) {
            subs.remove(i);
        }
    }
    
    @Override
    public void notifyObservers(){
        for (Observer observer : subs) {
            observer.update(st);
        }
    }
    
    public void newVideoUpload(){
        notifyObservers();
    }
    
}
