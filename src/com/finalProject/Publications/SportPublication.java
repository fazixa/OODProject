package com.finalProject.Publications;

import com.finalProject.Database;

import java.util.Date;

// SINGLETON CLASS
public class SportPublication extends Publication {

    private static volatile SportPublication instance;

    private SportPublication(){
        this.name =  "sport!";
        this.establishmentDate = new Date();
        this.head = "Sport Head";
        this.hashCode = (int)(Math.random() * 10000);

    }

    public static SportPublication getInstance(){
        if(instance == null){
            instance = new SportPublication();
            Database.getInstance().addPublication(instance);
        }
        return instance;
    }

}
