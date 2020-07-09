package com.finalProject;

/**
 * Created by asus on 7/8/2020.
 */
public class PersonalInformation {
    private String name;
    private String gender;
    private String birth;
    private int id;

    public PersonalInformation(String name, String gender, String birth) {
        this.name = name;
        this.gender = gender;
        this.birth = birth;
    }

    public PersonalInformation() {

    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBirth() {
        return birth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) { this.id = id;}

    public String toString(){

        return "Character "+ id+" has been created \nName:"+name+"\nGender:"+gender+"\nBirth:"+birth;
    }
}
