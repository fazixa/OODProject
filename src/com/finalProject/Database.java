package com.finalProject;

import com.finalProject.Publications.Publication;

import java.util.ArrayList;

public class Database {
    private ArrayList<Publication> publicationsList = new ArrayList<>();
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

    public ArrayList getPublicationList(){
     return publicationsList;
    }

}
