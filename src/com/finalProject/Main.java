package com.finalProject;

import com.finalProject.Publications.EconomicalPublication;
import com.finalProject.Publications.PoliticalPublication;
import com.finalProject.view.StarMark;
import com.finalProject.Publications.Publication;
import com.finalProject.Publications.SportPublication;
import com.finalProject.view.TextView;
import com.finalProject.view.QuestionMark;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<String> views = new ArrayList<>();
    private static void processCommand(String command){
        String[] commandSplited = command.split(" ");

        switch(commandSplited[0]){
            case "printInfo":
                for (TextView pub: Database.getInstance().getPublicationList()){
                    for(String s:views){
                        if (s.equals("*")){
                            pub=new StarMark(pub);

                        }else
                        if (s.equals("?")){
                            pub=new QuestionMark(pub);
                        }
                    }
                    System.out.println(pub.toText());
                }
                break;

            case "createModel":
                switch (commandSplited[1]){
                    case "sport":
                        SportPublication.getInstance();
                        break;
                    case "economical":
                        EconomicalPublication.getInstance();
                        break;
                    case "political":
                        PoliticalPublication.getInstance();
                        break;
                }
                break;

            case "addQ":
                views.add("?");
                break;
            case "removeQ":
                if (views.contains("?")) views.remove("?");
                break;

            case "addStar":
                views.add("*");
                break;
            case "removeStar":
                if (views.contains("*")) views.remove("*");
                break;


            default: System.out.println("command not found");
        }


    }

    public static void main(String[] args) {
	// write your code here


        Scanner sc = new Scanner(System.in);

        while (sc.hasNext())
        {
            String comm = sc.nextLine();
//            System.out.println(comm);
            processCommand(comm);

        }
//        TextView s = SportPublication.getInstance();
//        String res= new QuestionMark(new StarMark(s)).toText();
//        System.out.println(res);





    }
}
