package com.example.recyclerview.models;

import java.util.Random;

public class Task {
    private String title;
    private String textOfTask;
    private String imageURI;

    public Task(String title,String textOfTask,String i) {
        this.title = title;
        this.textOfTask=textOfTask;
        //int temp=new Random().nextInt(99999)+1000;
        imageURI=i;
    }

    public String getTitle() {
        return title;
    }

    public String getTextOfTask() {
        return textOfTask;
    }

    public String getImageURI() {
        return imageURI;
    }


}
