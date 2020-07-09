package com.finalProject.Publications;

import com.finalProject.DeliveryStrategy.CourierDelivery;
import com.finalProject.DeliveryStrategy.Delivery;
import com.finalProject.States.Editing;
import com.finalProject.States.Publishing;
import com.finalProject.States.State;
import com.finalProject.SubscriberInfo;


import com.finalProject.view.TextView;

import java.security.PrivateKey;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public abstract class Publication implements TextView {

    protected String name;
    protected Date establishmentDate;
    protected String head;
    protected int hashCode;
    protected State state = Editing.getInstance();
    protected Delivery delivery = CourierDelivery.getInstance();
    protected ArrayList<SubscriberInfo> subscriberInfo = new ArrayList<>();


    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
        String s = delivery.getClass().getName();
        String c = this.getClass().getName();
        s = s.substring(s.lastIndexOf('.') + 1);
        c = c.substring(c.lastIndexOf('.') + 1);
        System.out.println(c+"’s publishing method has been set to "+s);
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public ArrayList<SubscriberInfo> getSubscriberInfo() {
        return subscriberInfo;
    }

    public void addSubscriberInfo(SubscriberInfo s){
        if(subscriberInfo.contains(s)){
            return;
        }
        subscriberInfo.add(s);
    }

    public int getNumberOfSubscribersInfo(){
        return subscriberInfo.size();
    }

    public boolean subscriberExist(int id) {
        for (SubscriberInfo s : subscriberInfo) {
            if (s.getId() == id)
                return true;
        }
        return false;
    }


    //////////////////////////////////////////observer/////////////////////////////////////////////////



    //////////////////////////////////State Method And ObserverPattern/////////////////////////////////////////////////////////

    public void publish(String message){
        if(this.state instanceof Publishing){
            for (SubscriberInfo s : subscriberInfo) {
                s.update(message);
            }
            System.out.println("Status Changing Ended!!!!");
            delivery.notifyToSubscriber(this);
            System.out.println("End of Notifying!!!");

        }
        else System.out.println("Wrong State!!");

    }

    public void changeState(String state){
        this.state.changeState(state,this);
    }

    public void getEditingProgress(){
        this.state.getEditingProgress();
    }

    public void getPrintingProgress(){
        this.state.getPrintingProgress();
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //TODO convet these to tostring
    public String toText() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = formatter.format(this.establishmentDate);
        return String.format("Name: "+this.name+"\n"+"Date Established:"+ formattedDate+"\nHashcode: "+this.hashCode+"\nHead: "+this.head+"\n");
    }
}
