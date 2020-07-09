package com.finalProject.States;

import com.finalProject.Publications.Publication;

/**
 * Created by asus on 7/8/2020.
 */
public class Publishing extends State {

    private static volatile Publishing instance;

    private Publishing(){}


    public static Publishing getInstance(){
        if(instance == null){
            instance = new Publishing();
        }
        return instance;
    }

    @Override
    public void publish(Publication publication,String message){
        publication.notify(message);
    }


    @Override
    public void changeState(String state,Publication pub){
        System.out.println("Wrong State!!");
    }
}
