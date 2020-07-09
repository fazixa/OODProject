package com.finalProject;

/**
 * Created by asus on 7/8/2020.
 */
public class SubscribeAdapter implements InformationTarget{
    private SubscribeAdaptee subscribeAdaptee=new SubscribeAdaptee();
    private SubscriberInfo info;
    @Override
    public SubscriberInfo convertInformation(PersonalInformation information){
        this.info=subscribeAdaptee.informationConverting(information);
        return this.info;
    }

//    public SubscriberInfo getInfo() {
//        return info;
//    }
}
