package com.finalProject;

/**
 * Created by asus on 7/8/2020.
 */
public class PersonalInformation {
    private String name;
    private String gender;
    private String birth;
    private int id;

    public PersonalInformation(int id,String name, String gender, String birth) {
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.id=id;
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

    public String toString(){
        return "ID:"+id+"\nName:"+name+"\nGender:"+gender+"\nBirth:"+birth;
    }
}
