package com.finalProject.States;

import com.finalProject.Publications.Publication;

/**
 * Created by asus on 7/8/2020.
 */
public class Printing extends State {
    private static volatile Printing instance;

    private Printing(){
    }

    public static Printing getInstance(){
        if(instance == null){
            instance = new Printing();
        }
        return instance;
    }

    @Override
    public int getPrintingProgress() {
        int progress = (int)(Math.random() * 100);
        System.out.println("Progress:"+progress);
        return progress;

    }

    @Override
    public void changeState(String state,Publication pub){
        if(state.toLowerCase().equals("publishing")){
            pub.setState(Publishing.getInstance());
            System.out.println("State has changed to Publishing.");
        }else{
            System.out.println("wrong state");
        }

    }
}
