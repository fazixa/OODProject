package com.finalProject;

import com.finalProject.Publications.Publication;

import java.util.ArrayList;

public class Database {
    private ArrayList<Publication> publicationsList = new ArrayList<>();
    private ArrayList<PersonalInformation> personalInfosList = new ArrayList<>();
    private static Database instance;

    private Database(){}

    public static Database getInstance(){
        if(instance == null){
            instance = new Database();
        }
        return instance;
    }

    public void addPublication(Publication pub){
        publicationsList.add(pub);
    }

    public void addPersonalInfo(PersonalInformation personalInfo){
        personalInfosList.add(personalInfo);
    }


    public ArrayList<Publication> getPublicationList(){
        return publicationsList;
    }

    public int getIndexOfPersonalInfo(PersonalInformation personalInfo){
        return personalInfosList.indexOf(personalInfo);
    }

    public PersonalInformation getPersonalInfoByIndex(int id) {
        if (id < personalInfosList.size())
            return personalInfosList.get(id);
        else return null;
    }

    public ArrayList<PersonalInformation> getPersonalInfosList(){
        return personalInfosList;
    }
}
