package com.finalProject;

import com.finalProject.DeliveryStrategy.CourierDelivery;
import com.finalProject.DeliveryStrategy.OnlineDelivery;
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
                    default: System.out.println("Publication not found");
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
            case "getEditingProgress":
                switch (commandSplited[1]){
                    case "sport":
                        SportPublication sp = SportPublication.getInstance();
                        sp.getEditingProgress();
                        break;
                    case "economical":
                        EconomicalPublication ep=EconomicalPublication.getInstance();
                        ep.getEditingProgress();
                        break;
                    case "political":
                        PoliticalPublication pp = PoliticalPublication.getInstance();
                        pp.getEditingProgress();
                        break;
                }
                break;

            case "getPrintingProgress":
                switch (commandSplited[1]){
                    case "sport":
                        SportPublication sp = SportPublication.getInstance();
                        sp.getPrintingProgress();
                        break;
                    case "economical":
                        EconomicalPublication ep=EconomicalPublication.getInstance();
                        ep.getPrintingProgress();
                        break;
                    case "political":
                        PoliticalPublication pp = PoliticalPublication.getInstance();
                        pp.getPrintingProgress();
                        break;
                }
                break;

            case "startPrinting":
                switch (commandSplited[1]){
                    case "sport":
                        SportPublication sp = SportPublication.getInstance();
                        sp.changeState("printing");
                        break;
                    case "economical":
                        EconomicalPublication ep=EconomicalPublication.getInstance();
                        ep.changeState("printing");
                        break;
                    case "political":
                        PoliticalPublication pp = PoliticalPublication.getInstance();
                        pp.changeState("printing");
                        break;
                }
                break;


            case "startPublishing":
                switch (commandSplited[1]){
                    case "sport":
                        SportPublication sp = SportPublication.getInstance();
                        sp.changeState("publishing");
                        break;
                    case "economical":
                        EconomicalPublication ep=EconomicalPublication.getInstance();
                        ep.changeState("publishing");
                        break;
                    case "political":
                        PoliticalPublication pp = PoliticalPublication.getInstance();
                        pp.changeState("publishing");
                        break;
                }
                break;


            case "publish":
                switch (commandSplited[1]){
                    case "sport":
                        SportPublication sp = SportPublication.getInstance();
                        sp.publish(commandSplited[2]);
                        break;
                    case "economical":
                        EconomicalPublication ep=EconomicalPublication.getInstance();
                        ep.publish(commandSplited[2]);
                        break;
                    case "political":
                        PoliticalPublication pp = PoliticalPublication.getInstance();
                        pp.publish(commandSplited[2]);
                        break;
                }
                break;


            case "setPublishingMethod":
                switch (commandSplited[1]){
                    case "sport":
                        SportPublication sp = SportPublication.getInstance();
                        if (commandSplited[2].equals("\"courier\"")) sp.setDelivery(CourierDelivery.getInstance());
                        else sp.setDelivery(OnlineDelivery.getInstance());
                        break;
                    case "economical":
                        EconomicalPublication ep=EconomicalPublication.getInstance();
                        if (commandSplited[2].equals("\"courier\"")) ep.setDelivery(CourierDelivery.getInstance());
                        else ep.setDelivery(OnlineDelivery.getInstance());
                        break;
                    case "political":
                        PoliticalPublication pp = PoliticalPublication.getInstance();
                        if (commandSplited[2].equals("\"courier\"")) pp.setDelivery(CourierDelivery.getInstance());
                        else pp.setDelivery(OnlineDelivery.getInstance());
                        break;
                }
                break;


            case "createCharacter":
                PersonalInformation PI = new PersonalInformation(commandSplited[1], commandSplited[2], commandSplited[3]);
                Database.getInstance().addPersonalInfo(PI);
                int id = Database.getInstance().getIndexOfPersonalInfo(PI);
                PI.setId(id);
                System.out.println(PI);
                break;

            case "subscribe":
                switch (commandSplited[1]){
                    case "sport":
                        if(!SportPublication.getInstance().subscriberExist(Integer.parseInt(commandSplited[2])))
                        {
                            PersonalInformation PI2 = Database.getInstance().getPersonalInfoByIndex(Integer.parseInt(commandSplited[2]));
                            if(PI2!=null) SportPublication.getInstance().addSubscriberInfo(PI2);
                            else System.out.println("Your ID is invalid");
                        }
                        break;
                    case "political":
                        if(!PoliticalPublication.getInstance().subscriberExist(Integer.parseInt(commandSplited[2])))
                        {
                            PersonalInformation PI2 = Database.getInstance().getPersonalInfoByIndex(Integer.parseInt(commandSplited[2]));
                            if(PI2!=null) PoliticalPublication.getInstance().addSubscriberInfo(PI2);
                            else System.out.println("Your ID is invalid");
                        }
                        break;
                    case "economical":
                        if(!EconomicalPublication.getInstance().subscriberExist(Integer.parseInt(commandSplited[2])))
                        {
                            PersonalInformation PI2 = Database.getInstance().getPersonalInfoByIndex(Integer.parseInt(commandSplited[2]));
                            if(PI2!=null) EconomicalPublication.getInstance().addSubscriberInfo(PI2);
                            else System.out.println("Your ID is invalid");
                        }
                        break;
                        default: System.out.println("Publication not found");
                        //TODO handle id not found in database!
                }
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
