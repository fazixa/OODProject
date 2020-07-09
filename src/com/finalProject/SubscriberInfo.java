package com.finalProject;

/**
 * Created by asus on 7/8/2020.
 */
public class SubscriberInfo {
    private String name;
    private int gender;
    private int id;
    private int age;
    private String status;

    public SubscriberInfo(String name, int gender, int id, int age) {
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.age = age;
    }

    public SubscriberInfo() {
    }

    public int getId() {
        return id;
    }

    public void update(String message){
        this.status=message;
        System.out.println("SubscriberID:"+id+" Status changed to:"+status);
    }


    @Override
    public boolean equals(Object object)
    {
        boolean sameSame = false;

        if (object != null && object instanceof SubscriberInfo)
        {
            sameSame = this.id == ((SubscriberInfo) object).id;
        }

        return sameSame;
    }




    public String toString(){
        return "ID:"+id+"\nName:"+name+"\nGender:"+gender+"\nAge:"+age;
    }
}
