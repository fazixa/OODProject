package com.finalProject.view;

public class TextDecorator implements TextView {
    private TextView core;
    public TextDecorator(TextView inner){
        core = inner;
    }
    public String toText(){
        return core.toText();
    }

}
