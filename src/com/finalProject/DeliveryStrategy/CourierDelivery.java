package com.finalProject.DeliveryStrategy;

import com.finalProject.Publications.Publication;
import com.finalProject.SubscriberInfo;

/**
 * Created by asus on 7/9/2020.
 */
public class CourierDelivery extends Delivery {

    private static volatile CourierDelivery instance;

    private CourierDelivery(){}


    public static CourierDelivery getInstance(){
        if(instance == null){
            instance = new CourierDelivery();
        }
        return instance;
    }

    @Override
    public void notifyToSubscriber() {
            for (SubscriberInfo s : publication.getSubscriberInfo()) {
                System.out.println("Courier: Character "+s.getId()+"got the notif");
            }
        }



}
