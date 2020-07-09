package com.finalProject.view;

public class QuestionMark extends TextDecorator {
    public QuestionMark(TextView inner){
        super(inner);
    }

    public String toText(){
        return "?"+super.toText();
    }
}
