package com.finalProject.Publications;

import com.finalProject.Database;

import java.util.Date;

public class PoliticalPublication extends Publication {

    private static volatile PoliticalPublication instance;

    private PoliticalPublication(){
        this.name =  "politic!";
        this.establishmentDate = new Date();
        this.head = "Political Head";
        this.hashCode = (int)(Math.random() * 10000);

    }

    public static PoliticalPublication getInstance(){
        if(instance == null){
            instance = new PoliticalPublication();
            Database.getInstance().addPublication(instance);
        }
        return instance;
    }
}
