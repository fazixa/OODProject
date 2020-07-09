package com.finalProject.DeliveryStrategy;

import com.finalProject.Publications.Publication;

/**
 * Created by asus on 7/9/2020.
 */
public abstract class Delivery {

    public Publication publication;
    public abstract void notifyToSubscriber();


}
