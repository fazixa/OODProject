package com.finalProject;

/**
 * Created by asus on 7/8/2020.
 */
public class SubscribeAdapter implements InformationTarget{
    private SubscribeAdaptee subscribeAdaptee=new SubscribeAdaptee();

    @Override
    public SubscriberInfo convertInformation(PersonalInformation information){
        return subscribeAdaptee.informationConverting(information);

    }
}
