package com.finalProject.States;
import com.finalProject.Publications.Publication;

/**
 * Created by asus on 7/8/2020.
 */
public abstract class State {
    protected String name;
    public abstract void changeState(String state,Publication pub);
    public void publish(Publication publication,String message){System.out.println("Wrong State!");}
    public int getEditingProgress(){
        System.out.println("Wrong State!!");
        return -1;
    }
    public int getPrintingProgress(){
        System.out.println("Wrong State!!");
        return -1;
    }
}
