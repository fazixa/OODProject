package com.finalProject.DeliveryStrategy;

import com.finalProject.Publications.Publication;
import com.finalProject.SubscriberInfo;

/**
 * Created by asus on 7/9/2020.
 */
public class OnlineDelivery extends Delivery {

    private static volatile OnlineDelivery instance;

    private OnlineDelivery(){}

    public static OnlineDelivery getInstance(){
        if(instance == null){
            instance = new OnlineDelivery();
        }
        return instance;
    }

    @Override
    public void notifyToSubscriber() {
        for (SubscriberInfo s : publication.getSubscriberInfo()) {
            System.out.println("Online: We sent notif to Character "+s.getId());
        }
    }



}