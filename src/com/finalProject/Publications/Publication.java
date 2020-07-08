package com.finalProject.Publications;

import java.security.PrivateKey;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public abstract class Publication {

    protected String name;
    protected Date establishmentDate;
    protected String head;
    protected int hashCode;

    //TODO this method must be moved to decorator
    public String Textview() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = formatter.format(this.establishmentDate);
        return String.format("Name: "+this.name+"\n"+"Date Established:"+ formattedDate+"\nHashcode: "+this.hashCode+"\nHead: "+this.head+"\n");
    }
}
