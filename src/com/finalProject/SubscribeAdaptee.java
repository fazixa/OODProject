package com.finalProject;

/**
 * Created by asus on 7/8/2020.
 *
 */
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class SubscribeAdaptee {

    private SubscriberInfo subscriberInfo;



    public SubscriberInfo informationConverting(PersonalInformation information){
            String[] birth = information.getBirth().split("/");
            int gender=0;
            int age;
            switch (information.getGender()){
                case "male":
                    gender=0;
                    break;
                case "female":
                    gender=1;
                    break;

            }

        Date date = new Date();
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Europe/Paris"));
        cal.setTime(date);
        int year = cal.get(Calendar.YEAR);
        age = year-Integer.parseInt(birth[2]);
        SubscriberInfo subInfo = new SubscriberInfo(information.getName(),gender,information.getId(),age);
        this.subscriberInfo=subInfo;
        return  subInfo;

        }

    public SubscriberInfo getSubscriberInfo() {
        return subscriberInfo;
    }

}
