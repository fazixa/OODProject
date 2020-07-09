package com.finalProject.Publications;

import com.finalProject.Database;

import java.util.Date;

public class EconomicalPublication extends Publication{
    private static volatile EconomicalPublication instance;

    private EconomicalPublication(){
        this.name =  "Economical!";
        this.establishmentDate = new Date();
        this.head = "Economical Head";
        this.hashCode = (int)(Math.random() * 10000);

    }

    public static EconomicalPublication getInstance(){
        if(instance == null){
            instance = new EconomicalPublication();
            Database.getInstance().addPublication(instance);
        }
        return instance;
    }
}
