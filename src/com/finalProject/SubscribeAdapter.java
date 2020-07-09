package com.finalProject;

/**
 * Created by asus on 7/8/2020.
 */
public class SubscribeAdapter implements InformationTarget{
    private SubscribeAdaptee subscribeAdaptee=new SubscribeAdaptee();
    private SubscriberInfo info;
    @Override
    public void convertInformation(PersonalInformation information){
        this.info=subscribeAdaptee.informationConverting(information);
    }

    public SubscriberInfo getInfo() {
        return info;
    }
}
