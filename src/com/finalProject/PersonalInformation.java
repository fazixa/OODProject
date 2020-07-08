package com.finalProject;

/**
 * Created by asus on 7/8/2020.
 */
public class PersonalInformation {
    private String name;
    private String gender;
    private String birth;

    public PersonalInformation(String name, String gender, String birth) {
        this.name = name;
        this.gender = gender;
        this.birth = birth;
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

    public String toString(){
        return "Name: "+name+",Gender: "+gender+",birth: "+birth;
    }
}
