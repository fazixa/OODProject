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

    private static void processCommand(String command){
        String[] commandSplited = command.split(" ");
        System.out.println(commandSplited[0]);
        ArrayList<String> views = new ArrayList<>();

        switch(commandSplited[0]){
            case "printInfo":
            TextView pub = SportPublication.getInstance();
                for(String s:views){
                    if (s.equals("*")){
                        pub=new StarMark(pub);
                        System.out.println("starrrrrrrrr");
                    }else
                    if (s.equals("?")){
                        pub=new QuestionMark(pub);
                        System.out.println("QQQQQQQQQQQQ");
                    }
                }
                System.out.println(pub.toText());
                break;

            case "createModel":
                break;

            case "addQ":
                views.add("?");
                System.out.println(views);
                break;
            case "removeQ":
                if (views.contains("?")) views.remove("?");
                break;

            case "addStar":
                views.add("*");
                break;
            case "removeStar":
                if (views.contains("*")) views.remove("*");


            default: System.out.println("command not found");

        }


//        // CREATE MODEL
//        if(commandSplited[0].equals("createModel")){
//            if(commandSplited[1].equals("\"sport\"")){
//                SportPublication.getInstance();
//            }else
//            if(commandSplited[1].equals("\"Political\"")){
//                PoliticalPublication.getInstance();
//            }else
//            if(commandSplited[1].equals("\"economical\"")){
//                EconomicalPublication.getInstance();
//            }
//        }else
//
//


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
