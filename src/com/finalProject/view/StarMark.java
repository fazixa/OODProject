package com.finalProject.view;

public class StarMark extends TextDecorator {
    public  StarMark(TextView inner){
        super(inner);
    }

    public String toText(){
        return "*"+super.toText();
    }

}
