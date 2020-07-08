package com.finalProject;

import com.finalProject.Publications.PoliticalPublication;
import com.finalProject.Publications.Publication;
import com.finalProject.Publications.SportPublication;

import java.util.Scanner;

public class Main {

    private static void processCommand(String command){
        String[] commandSplited = command.split(" ");

        // PRINT INFO
        if(commandSplited[0].equals("printInfo")){
            //TODO after decorator implemented
        }
        else
        // CREATE MODEL
        if(commandSplited[0].equals("createModel")){
            if(commandSplited[1].equals("\"sport\"")){
                SportPublication.getInstance();
            }else
            if(commandSplited[1].equals("\"Political\"")){
                PoliticalPublication.getInstance();
            }else
            if(commandSplited[1].equals("\"economical\"")){
                SportPublication.getInstance();
            }
        }
        else
            System.out.println("Command not Found");


    }

    public static void main(String[] args) {
	// write your code here


        Scanner sc = new Scanner(System.in);

        while (sc.hasNext())
        {
            String comm = sc.nextLine();
            processCommand(comm);

        }





    }
}
