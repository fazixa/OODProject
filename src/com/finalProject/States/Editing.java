package com.finalProject.States;

import com.finalProject.Publications.Publication;

/**
 * Created by asus on 7/8/2020.
 */
public class Editing extends State {

    private static volatile Editing instance;

    private Editing(){}

    public static Editing getInstance(){
        if(instance == null){
            instance = new Editing();
        }
        return instance;
    }

    @Override
    public int getEditingProgress() {
        int progress = (int)(Math.random() * 100);
        System.out.println("Progress:"+progress);
        return progress;

    }
    @Override
    public void changeState(String state,Publication pub){
        if(state.toLowerCase().equals("printing")){
            pub.setState(Printing.getInstance());
            System.out.println("State has changed to Printing.");
        }else{
            System.out.println("wrong state");
        }

    }




}
