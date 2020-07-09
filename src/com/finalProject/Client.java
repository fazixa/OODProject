package com.finalProject;

import com.finalProject.PersonalInformation;

/**
 * Created by asus on 7/8/2020.
 */
public class Client {

    private int id;
    private PersonalInformation info;
    public Client(PersonalInformation info){
        this.id=info.getId();
        this.info = info;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {

        return id;
    }



    public PersonalInformation getInfo() {
        return info;
    }

    public String toString(){
        return ""+info;
    }
}
